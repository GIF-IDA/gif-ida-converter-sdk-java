/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
package org.zgif.model.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * @author Martin Fluegge
 * 
 */
public class GenerationPostProcessor {


    //@formatter:off
    private List<String> deleteFiles    = Arrays.asList("ObjectFactory.java");
    private List<String> typeNames      = Arrays.asList("Amount",
                                                        "Area"
                                                       );
    
    private List<String> removeLines    = Arrays.asList("    @XmlElement(name = \"extension_map\")",
                                                        "    protected ExtensionMap extensionMap;"
                                                        );
    //@formatter:on

    private static final String BASE_PACKAGE    = "org.zgif.model";
    private static final String NODE_PACKAGE    = "org.zgif.model.node";
    private static final String GROUP_PACKAGE   = "org.zgif.model.node.group";
    private static final String ENTITY_PACKAGE  = "org.zgif.model.node.entity";
    private static final String TYPE_PACKAGE    = "org.zgif.model.datatype";
    private static final String ENUM_PACKAGE    = "org.zgif.model.datatype.enumeration";

    private static final Logger ROOT_LOGGER     = Logger.getRootLogger();
    private static final Log    LOG             = LogFactory.getLog(GenerationPostProcessor.class);

    private File                baseDir;
    private Map<String, String> classPackageMap = new HashMap<String, String>();

    public static void main(String[] args) throws Throwable {
        if (!ROOT_LOGGER.getAllAppenders().hasMoreElements()) {
            PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p [%t] %c: %m%n");
            ConsoleAppender consoleAppender = new ConsoleAppender(layout);
            ROOT_LOGGER.addAppender(consoleAppender);
            ROOT_LOGGER.setLevel(Level.ALL);
        }

        new GenerationPostProcessor().run();
    }

    public void run() throws Throwable {
        LOG.info("Starting post processing");

        File scriptPath = new File(getClass().getResource("").toURI());
        baseDir = traversalFile(scriptPath, "..", "..", "..", "..", "..", "..", "src", "main", "generated-sources");
        LOG.debug("baseDir=" + baseDir);

        File modelBaseDir = traversalFile(baseDir, BASE_PACKAGE.split("[.]"));
        for (File subDir : modelBaseDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        })) {
            LOG.info("delete dir: " + subDir);
            boolean isDeleted = deleteFile(subDir);
            if (!isDeleted) {
                LOG.error("cannot delete dir: " + subDir.getCanonicalPath());
                throw new Exception("cannot delete dir: " + subDir.getCanonicalPath());
            }
        }

        Boolean arePackagesToClean = false;
        for (File sourceFile : modelBaseDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isFile() && f.getName().endsWith(".java");
            }
        })) {
            arePackagesToClean = true;

            String fileName = sourceFile.getName();

            if (deleteFiles.contains(fileName)) {
                sourceFile.delete();
            } else {
                String packageName = null;

                if (packageName == null) {
                    for (String typeName : typeNames) {
                        if (fileName.equals(typeName + ".java")) {
                            packageName = TYPE_PACKAGE;
                        }
                    }
                }

                if (packageName == null) {
                    if (fileName.equals("AbstractGroupNode.java") || fileContains(sourceFile, ".*extends AbstractGroupNode.*", ".*protected.*;")) {
                        packageName = GROUP_PACKAGE;
                    }
                }

                if (packageName == null) {
                    if (fileName.equals("AbstractEntityNode.java") || fileContains(sourceFile, ".*extends AbstractEntityNode.*", ".*protected.*;")) {
                        packageName = ENTITY_PACKAGE;
                    }
                }
                
                if (packageName == null) {
                    if (fileName.equals("AbstractNode.java") || fileContains(sourceFile, ".*extends AbstractNode.*", ".*protected.*;")) {
                        packageName = NODE_PACKAGE;
                    }
                }

                if (packageName == null) {
                    if (fileContains(sourceFile, "public enum .*", ".*protected.*;")) {
                        packageName = ENUM_PACKAGE;
                    }
                }

                // TODO: bad workaround until other bugs with generating are
                // completed
                if (packageName == null) {
                    if (fileName.startsWith("Hash") || fileName.startsWith("Term") || fileName.endsWith("s.java")) {
                        packageName = ENTITY_PACKAGE;
                    }
                }

                if (packageName != null) {
                    moveFile(sourceFile, packageName);
                }
            }
        }

        if (arePackagesToClean) {
            cleanupPackage(NODE_PACKAGE);
            cleanupPackage(ENTITY_PACKAGE);
            cleanupPackage(GROUP_PACKAGE);
            cleanupPackage(TYPE_PACKAGE);
            cleanupPackage(ENUM_PACKAGE);
            cleanupPackage(BASE_PACKAGE);
        } else {
            LOG.warn("no java files found in baseDir");
            throw new Exception("no java files found in baseDir");
        }
    }

    public void moveFile(File sourceFile, String packageName) throws Throwable {
        String fileName = sourceFile.getName();
        LOG.info("move file '" + fileName + "' to package: " + packageName);

        File newDir = traversalFile(baseDir.getCanonicalFile(), packageName.split("[.]"));
        File newSourceFile = new File(newDir, fileName);

        newDir.mkdirs();
        Boolean renamed = sourceFile.renameTo(newSourceFile);

        if (renamed) {
            classPackageMap.put(fileName.substring(0, fileName.length() - 5), packageName);
        }
    }

    public void cleanupPackage(String packageName) throws Throwable {
        LOG.info("cleanup package: " + packageName);

        File packageDir = traversalFile(baseDir.getCanonicalFile(), packageName.split("[.]"));
        LOG.debug("packageDir=" + packageDir);
        if (packageDir.exists()) {
            for (File sourceFile : packageDir.listFiles()) {
                if (sourceFile.isFile() && sourceFile.getName().endsWith(".java")) {
                    rewriteFile(sourceFile, packageName);
                }
            }
        }
    }

    public void rewriteFile(File sourceFile, String packageName) throws Throwable {
        final String fileName = sourceFile.getName();
        final String currentModelClassName = fileName.substring(0, fileName.length() - 5);

        Set<String> usedModelClasses = new HashSet<String>();

        final String linePublicClass = "public class " + currentModelClassName + " {";
        String classExtension = null;
        if (packageName.equals(NODE_PACKAGE)) {
            classExtension = "AbstractNode";
            usedModelClasses.add("AbstractNode");
        } else if (packageName.equals(ENTITY_PACKAGE)) {
            classExtension = "AbstractEntityNode";
            usedModelClasses.add("AbstractEntityNode");
        } else if (packageName.equals(GROUP_PACKAGE)) {
            classExtension = "AbstractGroupNode";
            usedModelClasses.add("AbstractGroupNode");
        }

        // backup File
        File tmpFile = new File(sourceFile.getParent(), fileName + ".bak");
        sourceFile.renameTo(tmpFile);

        // read file
        BufferedReader reader = new BufferedReader(new FileReader(tmpFile));

        StringBuilder body = new StringBuilder((int) tmpFile.length());
        String lineBefore = "";
        Set<String> flags = new HashSet<String>();
        for (String line = reader.readLine(); line != null; line = reader.readLine()) {
            if (lineBefore.equals("    /**") && line.contains("extensionMap")) {
                flags.add("xetter_extensionMap");
                body.append("*/");
                body.append(System.lineSeparator());
            }
            if (lineBefore.equals("    /**") && line.contains("validFrom")) {
                flags.add("xetter_validFrom");
                body.append("*/");
                body.append(System.lineSeparator());
            }
            if (lineBefore.equals("    /**") && line.contains("validTo")) {
                flags.add("xetter_validTo");
                body.append("*/");
                body.append(System.lineSeparator());
            }

            if (!removeLines.contains(line) && !flags.contains("xetter_extensionMap") && !flags.contains("xetter_validFrom")
                && !flags.contains("xetter_validTo")) {
                for (String modelClass : classPackageMap.keySet()) {
                    if (!modelClass.equals(currentModelClassName) && (line.contains(" " + modelClass + " ") || line.contains(modelClass + ".class") || line.contains("extends " + modelClass))) {
                        usedModelClasses.add(modelClass);
                    }
                }

                if (classExtension != null && !flags.contains("PublicClassPassed") && line.equals(linePublicClass)) {
                    line = line.substring(0, line.length() - 1) + "extends " + classExtension + " {";
                    flags.add("PublicClassPassed");
                }

                if (!line.startsWith("package")) {
                    body.append(line);
                    body.append(System.lineSeparator());
                }
            }

            if (flags.contains("xetter_extensionMap") && line.equals("    }")) {
                flags.remove("xetter_extensionMap");
            }
            if (flags.contains("xetter_validFrom") && line.equals("    }")) {
                flags.remove("xetter_validFrom");
            }
            if (flags.contains("xetter_validTo") && line.equals("    }")) {
                flags.remove("xetter_validTo");
            }

            lineBefore = line;
        }
        reader.close();

        // append package and imports
        BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile));
        writer.append("package " + packageName + ";" + System.lineSeparator() + System.lineSeparator());
        for (String usedModel : usedModelClasses) {
            writer.append("import " + classPackageMap.get(usedModel) + "." + usedModel + ";" + System.lineSeparator());
        }

        // write body
        writer.append(body.toString());
        writer.close();

        // delete original file
        tmpFile.delete();
    }

    // public static Boolean fileContains(File file, String regex) throws
    // FileNotFoundException {
    // fileContains(file, regex, null);
    // }
    public static Boolean fileContains(File file, String regex, String stopRegex) throws FileNotFoundException {
        final BufferedReader reader = new BufferedReader(new FileReader(file));
        Boolean found = false;

        try {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                if (Pattern.matches(regex, line)) {
                    found = true;
                    break;
                }
                if (stopRegex != null && Pattern.matches(stopRegex, line)) {
                    break;
                }
            }
        } catch (IOException e) {
            LOG.warn("unable to read " + file.getAbsolutePath(), e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }

        return found;
    }

    public static File traversalFile(File base, String... nodes) {
        File curFile = base;
        for (String curNode : nodes) {
            if (curNode.equals("..")) {
                curFile = curFile.getParentFile();
            } else if (curNode.equals(".")) {
                // nothing to do
            } else {
                curFile = new File(curFile, curNode);
            }

        }
        return curFile;
    }

    public static boolean deleteFile(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    return file.delete();
                } else {
                    String files[] = file.list();
                    for (String subFile : files) {
                        boolean isDeleted = deleteFile(new File(file, subFile));
                        if (!isDeleted) {
                            return false;
                        }
                    }

                    if (file.list().length == 0) {
                        return file.delete();
                    }
                }
            } else {
                return file.delete();
            }
        }

        return false;
    }
}
