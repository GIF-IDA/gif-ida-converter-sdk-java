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
package org.zgif.tooling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.zgif.model.node.group.ExtensionMap;

/**
 * @author Martin Fluegge
 * 
 */
public class GenerationPostProcessor {


    //@formatter:off
    private List<String> deleteFiles    = Arrays.asList("ObjectFactory.java");
    private List<String> entityNames    = Arrays.asList("Account",
                                                        "BookEntry",
                                                        "Building",
                                                        "Company",
                                                        "Land",
                                                        "Lease",
                                                        "Project",
                                                        "Property",
                                                        "Record",
                                                        "ServiceContract",
                                                        "Term",
                                                        "Unit",
                                                        "Valuation"
                                                       );
    private List<String> subEntityNames = Arrays.asList("Address",
                                                        "EnergyRating",
                                                        "ExtensionMap",
                                                        "ExtensionMapKey",
                                                        "ExtensionSubList",
                                                        "ExtensionSubListItem",
                                                        "ExtensionSubMap"
                                                        );
    private List<String> typeNames      = Arrays.asList("Amount",
                                                        "Area"
                                                       );
    private List<String> nodeNames      = Arrays.asList("Data",
                                                        "Manifest",
                                                        "Meta",
                                                        "Periods",
                                                        "ZGif"
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
        baseDir = traversalFile(scriptPath, "..", "..", "..", "..", "..", "src", "main", "generated-sources");
        LOG.debug("baseDir=" + baseDir);

        addPluralToEntityList();

        for (File sourceFile : baseDir.listFiles()) {
            String fileName = sourceFile.getName();
            
            if(deleteFiles.contains(fileName)) {
                sourceFile.delete();
            } else if (sourceFile.isFile() && fileName.endsWith(".java")) {
                String packageName = null;

                if (packageName == null) {
                    for (String nodeName : nodeNames) {
                        if (fileName.equals(nodeName + ".java")) {
                            packageName = NODE_PACKAGE;
                        }
                    }
                }

                if (packageName == null) {
                    for (String entityName : entityNames) {
                        if (fileName.endsWith(entityName + ".java")) {
                            packageName = ENTITY_PACKAGE;
                        }
                    }
                }

                if (packageName == null) {
                    for (String subEntityName : subEntityNames) {
                        if (fileName.equals(subEntityName + ".java")) {
                            packageName = GROUP_PACKAGE;
                        }
                    }
                }

                if (packageName == null) {
                    for (String typeName : typeNames) {
                        if (fileName.equals(typeName + ".java")) {
                            packageName = TYPE_PACKAGE;
                        }
                    }
                }

                if (packageName == null) {
                    if (fileContains(sourceFile, "public enum .*")) {
                        packageName = ENUM_PACKAGE;
                    }
                }

                if (packageName != null) {
                    moveFile(sourceFile, packageName);
                }
            }
        }

        cleanupPackage(NODE_PACKAGE);
        cleanupPackage(ENTITY_PACKAGE);
        cleanupPackage(GROUP_PACKAGE);
        cleanupPackage(TYPE_PACKAGE);
        cleanupPackage(ENUM_PACKAGE);
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
        for (File sourceFile : packageDir.listFiles()) {
            if (sourceFile.isFile() && sourceFile.getName().endsWith(".java")) {
                rewriteFile(sourceFile, packageName);
            }
        }
    }

    public void rewriteFile(File sourceFile, String packageName) throws Throwable {
        final String fileName = sourceFile.getName();
        final String currentModelClassName = fileName.substring(0, fileName.length() - 5);

        final String linePublicClass = "public class " + currentModelClassName + " {";
        String classExtension = null;
        if (packageName.equals(NODE_PACKAGE)) {
            classExtension = "AbstractNode";
        } else if (packageName.equals(ENTITY_PACKAGE)) {
            classExtension = "AbstractEntityNode";
        } else if (packageName.equals(GROUP_PACKAGE)) {
            classExtension = "AbstractGroupNode";
        }

        // backup File
        File tmpFile = new File(sourceFile.getParent(), fileName + ".bak");
        sourceFile.renameTo(tmpFile);

        // read file
        BufferedReader reader = new BufferedReader(new FileReader(tmpFile));
        Set<String> usedModelClasses = new HashSet<String>();

        StringBuilder body = new StringBuilder((int) tmpFile.length());
        String lineBefore = "";
        Set<String> flags = new HashSet<String>();
        for (String line = reader.readLine(); line != null; line = reader.readLine()) {
            if (lineBefore.equals("    /**") && line.contains("extensionMap")) {
                flags.add("xetter_extensionMap");
                body.append("*/\r\n");
            }
            if (lineBefore.equals("    /**") && line.contains("validFrom")) {
                flags.add("xetter_validFrom");
                body.append("*/\r\n");
            }
            if (lineBefore.equals("    /**") && line.contains("validTo")) {
                flags.add("xetter_validTo");
                body.append("*/\r\n");
            }

            
            
            if (!removeLines.contains(line)
                && !flags.contains("xetter_extensionMap")
                && !flags.contains("xetter_validFrom")
                && !flags.contains("xetter_validTo")
                ) {
                for (String modelClass : classPackageMap.keySet()) {
                    if (!modelClass.equals(currentModelClassName) && line.contains(" " + modelClass + " ")) {
                        usedModelClasses.add(modelClass);
                    }
                }

                if (classExtension != null && !flags.contains("PublicClassPassed") && line.equals(linePublicClass)) {
                    line = line.substring(0, line.length() - 1) + "extends " + classExtension + " {";
                    flags.add("PublicClassPassed");
                }

                body.append(line);
                body.append("\r\n");
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
        writer.append("package " + packageName + ";\r\n");
        for (String usedModel : usedModelClasses) {
            writer.append("import " + classPackageMap.get(usedModel) + "." + usedModel + ";\r\n");
        }

        // write body
        writer.append(body.toString());
        writer.close();

        // delete original file
        tmpFile.delete();
    }

    private void addPluralToEntityList() {
        List<String> entityPluralNames = new ArrayList<String>();
        for (String entity : entityNames) {

            if (entity.endsWith("y")) {
                entity = entity.substring(0, entity.length() - 1) + "ie";
            }

            entityPluralNames.add(entity + "s");
        }

        entityPluralNames.addAll(entityNames);
        entityNames = entityPluralNames;
    }

    public static Boolean fileContains(File file, String regex) throws FileNotFoundException {
        final Scanner scanner = new Scanner(file);
        Boolean found = false;

        while (scanner.hasNextLine() && !found) {
            final String lineFromFile = scanner.nextLine();
            if (Pattern.matches(regex, lineFromFile)) {
                found = true;
            }
        }
        scanner.close();

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
}
