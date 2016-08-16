///*******************************************************************************
// * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *    Martin Fluegge - initial API and implementation and/or initial documentation
// *
// *******************************************************************************/
//package org.zgif.model.tools;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.FilenameFilter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.apache.log4j.ConsoleAppender;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;
//import org.zgif.model.datatype.enumeration.Subset;
//import org.zgif.model.node.entity.AbstractEntityNode;
//
///**
// * @author Pascal Houdek
// *
// */
//public class ThirdTierModelSourceGenerator {
//
//    private static final Logger ROOT_LOGGER = Logger.getRootLogger();
//    private static final Log    LOG         = LogFactory.getLog(GenerationPostProcessor.class);
//
//    private File                mainDir;
//    private File                sourcesDir;
//
//    public ThirdTierModelSourceGenerator() {
//    }
//
//    public static void main(String[] args) throws Throwable {
//        if (!ROOT_LOGGER.getAllAppenders().hasMoreElements()) {
//            PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p [%t] %c: %m%n");
//            ConsoleAppender consoleAppender = new ConsoleAppender(layout);
//            ROOT_LOGGER.addAppender(consoleAppender);
//            ROOT_LOGGER.setLevel(Level.ALL);
//        }
//
//        new ThirdTierModelSourceGenerator().run();
//    }
//
//    public void run() throws Throwable {
//        File scriptPath = new File(getClass().getResource("").toURI());
//        LOG.debug(scriptPath);
//        mainDir = traversalFile(scriptPath, "..", "..", "..", "..", "..", "..", "src", "main");
//        sourcesDir = traversalFile(mainDir, "generated-sources");
//
//        File xsdDir = traversalFile(mainDir, "resources", "xsd", "validation");
//        LOG.info("xsdDir=" + xsdDir);
//
//        for (File xsdFile : xsdDir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("instance_maindata_");
//            }
//        })) {
//            String fileName = xsdFile.getName();
//            Subset subset = Subset.fromString(fileName.substring(fileName.lastIndexOf("_") + 1, fileName.lastIndexOf(".")).replace('-', '_'));
//            buildTier(xsdFile, subset);
//        }
//    }
//
//    public void buildTier(File xsd, Subset subset) throws Throwable {
//        LOG.info("build subset: " + subset);
//
//        String basePackage = "org.zgif.model.subset_" + subset.name().substring(1);
//        String nodePackage = basePackage + ".node";
//        String entityPackage = nodePackage + ".entity";
//
//        File subsetDir = traversalFile(sourcesDir, basePackage.split("[.]"));
//        deleteFile(subsetDir);
//
//        BufferedReader reader = new BufferedReader(new FileReader(xsd));
//        DataWriter dataWriter = new DataWriter(subsetDir, nodePackage, subset);
//        Map<Class<AbstractEntityNode>, EntityWriter> entityWriters = new HashMap<Class<AbstractEntityNode>, EntityWriter>();
//        for (String line = reader.readLine(); line != null; line = reader.readLine()) {
//            if (line.matches(".*\"count\\(/data/[a-zA-Z]{4,15}s\\)\\s+= [01].*")) {
//                LOG.debug("datainfo - " + line);
//
//                if (line.matches(".*\\s+= 1.*")) {
//                    String[] parts = line.split(" or ");
//                    for (String part : parts) {
//                        String className = part.substring(part.indexOf("/data/") + 6, part.lastIndexOf("s)") + 1);
//                        Class<AbstractEntityNode> entityClass = (Class<AbstractEntityNode>) Class.forName("org.zgif.model.node.entity." + className);
//                        dataWriter.addRootEntity(entityClass, Duty.CORE);
//                    }
//                }
//                if (line.matches(".*\\s+= 0.*")) {
//                    String[] parts = line.split(" or ");
//                    for (String part : parts) {
//                        String className = part.substring(part.indexOf("/data/") + 6, part.lastIndexOf("s)") + 1);
//                        Class<AbstractEntityNode> entityClass = (Class<AbstractEntityNode>) Class.forName("org.zgif.model.node.entity." + className);
//                        dataWriter.addRootEntity(entityClass, Duty.NOT);
//                    }
//                }
//            } else if (line.matches(".*\"count\\(//[a-zA-Z]{4,15}\\)\\s+[>]?= .*")) {
//                LOG.debug("entity info - " + line);
//
//                if (line.contains(">= 0")) {
//                    String className = line.substring(line.indexOf("//") + 2, line.lastIndexOf(")"));
//                    Class<AbstractEntityNode> entityClass = (Class<AbstractEntityNode>) Class.forName("org.zgif.model.node.entity." + className);
//
//                    new EntityWriter(subsetDir, entityPackage, subset, entityClass, null).close();
//                }
//
//            } else if (line.matches(".*\"count\\(//[a-zA-Z]{4,15}(/[a-zA-Z]+)?\\[.*\\]\\)\\s+= .*")) {
//                LOG.debug("datafield info - " + line);
//            } else {
//                LOG.debug("no info - " + line);
//            }
//        }
//        dataWriter.close();
//
//        reader.close();
//    }
//
//    public static File traversalFile(File base, String... nodes) {
//        File curFile = base;
//        for (String curNode : nodes) {
//            if (curNode.equals("..")) {
//                curFile = curFile.getParentFile();
//            } else if (curNode.equals(".")) {
//                // nothing to do
//            } else {
//                curFile = new File(curFile, curNode);
//            }
//
//        }
//        return curFile;
//    }
//
//    public static boolean deleteFile(File file) {
//        if (file.exists()) {
//            if (file.isDirectory()) {
//                if (file.list().length == 0) {
//                    return file.delete();
//                } else {
//                    String files[] = file.list();
//                    for (String subFile : files) {
//                        boolean isDeleted = deleteFile(new File(file, subFile));
//                        if (!isDeleted) {
//                            return false;
//                        }
//                    }
//
//                    if (file.list().length == 0) {
//                        return file.delete();
//                    }
//                }
//            } else {
//                return file.delete();
//            }
//        }
//
//        return false;
//    }
//
//    public static class DataWriter {
//        private List<Class<AbstractEntityNode>> rootEntitiesNOT  = new ArrayList<Class<AbstractEntityNode>>();
//        private List<Class<AbstractEntityNode>> rootEntitiesCORE = new ArrayList<Class<AbstractEntityNode>>();
//        private String                          packageName;
//        private File                            subsetDir;
//        private Subset                          subset;
//
//        public DataWriter(File subsetDir, String packageName, Subset subset) {
//            this.packageName = packageName;
//            this.subsetDir = subsetDir;
//            this.subset = subset;
//        }
//
//        public void addRootEntity(Class<AbstractEntityNode> rootEntity, Duty duty) {
//            if (duty == Duty.NOT) {
//                rootEntitiesNOT.add(rootEntity);
//            }
//            if (duty == Duty.CORE) {
//                rootEntitiesCORE.add(rootEntity);
//            }
//        }
//
//        public void close() {
//            File nodeDir = traversalFile(subsetDir, "node");
//            nodeDir.mkdirs();
//            File dataFile = new File(nodeDir, "Data.java");
//
//            BufferedWriter bw = null;
//            try {
//                bw = new BufferedWriter(new FileWriter(dataFile));
//                wl(bw, "package ", packageName, ";");
//                wl(bw);
//                for (Class<AbstractEntityNode> entity : rootEntitiesNOT) {
//                    String entityName = entity.getSimpleName();
//                    wl(bw, "import org.zgif.model.node.entity.", entityName, ";");
//                }
//                for (Class<AbstractEntityNode> entity : rootEntitiesCORE) {
//                    String entityName = entity.getSimpleName();
//                    wl(bw, "import org.zgif.model.subset_", subset.name().substring(1), ".node.entity.", entityName, ";");
//                }
//                wl(bw);
//
//                wl(bw, "public class Data extends org.zgif.model.node.Data {");
//
//                for (Class<AbstractEntityNode> entity : rootEntitiesCORE) {
//                    String entityName = entity.getSimpleName();
//                    String attributeName = entityName.substring(0, 1).toLowerCase() + entityName.substring(1);
//
//                    wl(bw, "    public ", entityName, " get", entityName, "() {");
//                    wl(bw, "        return (", entityName, ") this.", attributeName, ";");
//                    wl(bw, "    }");
//                    wl(bw);
//                    wl(bw, "    public void set", entityName, "(", entityName, " ", attributeName, ") {");
//                    wl(bw, "        super.set", entityName, "(", attributeName, ");");
//                    wl(bw, "    }");
//                    wl(bw);
//                    wl(bw, "    /**");
//                    wl(bw, "      * DO NOT USE THIS METHOD!");
//                    wl(bw, "      * This entity is not permitted for subset ", subset.toString(), "!");
//                    wl(bw, "      **/");
//                    wl(bw, "    @Deprecated");
//                    wl(bw, "    public void set", entityName, "(org.zgif.model.node.entity.", entityName, " ", attributeName, ") {");
//                    wl(bw, "        if(", attributeName, " instanceof ", entityName, ") {");
//                    wl(bw, "            set", entityName, "((", entityName, ")", attributeName, ");");
//                    wl(bw, "        } else {");
//                    wl(bw, "            throw new Error(\"only a ", entityName, "-object of subset ", subset.toString(), " is allowed\");");
//                    wl(bw, "        }");
//                    wl(bw, "    }");
//                }
//
//                for (Class<AbstractEntityNode> entity : rootEntitiesNOT) {
//                    String entityName = entity.getSimpleName();
//                    String attributeName = entityName.substring(0, 1).toLowerCase() + entityName.substring(1);
//
//                    wl(bw);
//                    wl(bw, "    /**");
//                    wl(bw, "      * DO NOT USE THIS METHOD!");
//                    wl(bw, "      * This entity is not permitted for subset ", subset.toString(), "!");
//                    wl(bw, "      **/");
//                    wl(bw, "    @Deprecated");
//                    wl(bw, "    public ", entityName, " get", entityName, "() {");
//                    wl(bw, "        throw new Error(\"this method is not allowed for subset ", subset.toString(), "\");");
//                    wl(bw, "    }");
//                    wl(bw);
//                    wl(bw, "    /**");
//                    wl(bw, "      * DO NOT USE THIS METHOD!");
//                    wl(bw, "      * This entity is not permitted for subset ", subset.toString(), "!");
//                    wl(bw, "      **/");
//                    wl(bw, "    @Deprecated");
//                    wl(bw, "    public void set", entityName, "(", entityName, " ", attributeName, ") {");
//                    wl(bw, "        throw new Error(\"this method is not allowed for subset ", subset.toString(), "\");");
//                    wl(bw, "    }");
//                }
//                wl(bw);
//                wl(bw, "}");
//            } catch (IOException e) {
//                LOG.error("failed writing " + dataFile, e);
//            } finally {
//                try {
//                    bw.close();
//                } catch (Exception e) {
//                }
//            }
//        }
//
//        private static void wl(BufferedWriter bw, String... content) throws IOException {
//            for (String part : content) {
//                bw.append(part);
//            }
//            bw.newLine();
//        }
//    }
//
//    public static enum Duty {
//        CORE, OPTIONAL, NOT
//    }
//
//    public static class EntityWriter {
//        private File                      subsetDir;
//        private String                    packageName;
//        private Subset                    subset;
//        private Class<AbstractEntityNode> entity;
//        private Duty                      duty;
//
//        public EntityWriter(File subsetDir, String packageName, Subset subset, Class<AbstractEntityNode> entity, Duty duty) {
//            this.subsetDir = subsetDir;
//            this.packageName = packageName;
//            this.subset = subset;
//            this.entity = entity;
//            this.duty = duty;
//        }
//
//        public void close() {
//            String entityName = entity.getSimpleName();
//            if (entityName.endsWith("y")) {
//                entityName = entityName.substring(0, entityName.length() - 1) + "ie";
//            }
//            entityName += "s";
//
//            File entityDir = traversalFile(subsetDir, "node", "entity");
//            entityDir.mkdirs();
//            File dataFile = new File(entityDir, entityName + ".java");
//
//            BufferedWriter bw = null;
//            try {
//                bw = new BufferedWriter(new FileWriter(dataFile));
//                wl(bw, "package ", packageName, ";");
//                wl(bw);
//
//                wl(bw, "public class ", entityName, " extends org.zgif.model.node.entity.", entityName, " {");
//
//                wl(bw);
//                wl(bw, "}");
//            } catch (IOException e) {
//                LOG.error("failed writing " + dataFile, e);
//            } finally {
//                try {
//                    bw.close();
//                } catch (Exception e) {
//                }
//            }
//        }
//
//        private static void wl(BufferedWriter bw, String... content) throws IOException {
//            for (String part : content) {
//                bw.append(part);
//            }
//            bw.newLine();
//        }
//    }
//}
