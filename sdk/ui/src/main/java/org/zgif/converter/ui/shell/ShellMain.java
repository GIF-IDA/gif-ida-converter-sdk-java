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
///**
// *
// */
//package org.zgif.converter.ui.shell;
//
//import java.util.Properties;
//
//import org.apache.commons.cli.CommandLine;
//import org.apache.commons.cli.CommandLineParser;
//import org.apache.commons.cli.DefaultParser;
//import org.apache.commons.cli.Option;
//import org.apache.commons.cli.Options;
//import org.apache.log4j.ConsoleAppender;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;
//import org.zgif.converter.plugin.input.IImportPlugin;
//import org.zgif.converter.plugin.input.ImportPluginConfiguration;
//import org.zgif.converter.plugin.output.ExportPluginConfiguration;
//import org.zgif.converter.plugin.output.IExportPlugin;
//import org.zgif.model.node.ZGif;
//
///**
// * @author phoudek
// *
// */
//public class ShellMain {
//
//    private static Logger logger = Logger.getRootLogger();
//
//    /**
//     * @param args
//     * @throws Exception
//     */
//    public static void main(String[] args) throws Exception {
//        PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p [%t] %c: %m%n");
//        ConsoleAppender consoleAppender = new ConsoleAppender(layout);
//        logger.addAppender(consoleAppender);
//        logger.setLevel(Level.ALL);
//        Options options = new Options();
//
//        Option guiOption = Option.builder("g").longOpt("gui").desc("start the GUI").build();
//        Option pluginOption = Option.builder("p").longOpt("plugin").required().argName("plugin=classpath").numberOfArgs(2).valueSeparator()
//            .desc("set classpath for plugins (import and export)").build();
//        Option importOption = Option.builder("i").longOpt("import").numberOfArgs(2).valueSeparator().desc("config for import plugin").build();
//        Option exportOption = Option.builder("e").longOpt("export").numberOfArgs(2).valueSeparator().desc("config for export plugin").build();
//
//        options.addOption(guiOption);
//        options.addOption(pluginOption);
//        options.addOption(importOption);
//        options.addOption(exportOption);
//
//        CommandLineParser parser = new DefaultParser();
//        CommandLine cmd = parser.parse(options, args);
//
//        Properties pluginProps = cmd.getOptionProperties("plugin");
//
//        String importPluginClassName = pluginProps.getProperty("import");
//        IImportPlugin importPlugin = null;
//        try {
//            importPlugin = (IImportPlugin) Class.forName(importPluginClassName).newInstance();
//        } catch (ClassNotFoundException e) {
//            logger.fatal("unable to load import plugin", e);
//        } catch (InstantiationException e) {
//            logger.fatal("unable to load import plugin", e);
//        } catch (IllegalAccessException e) {
//            logger.fatal("unable to load import plugin", e);
//        }
//
//        String exportPluginClassName = pluginProps.getProperty("export");
//        IExportPlugin exportPlugin = null;
//        try {
//            exportPlugin = (IExportPlugin) Class.forName(exportPluginClassName).newInstance();
//        } catch (ClassNotFoundException e) {
//            logger.fatal("unable to load export plugin", e);
//        } catch (InstantiationException e) {
//            logger.fatal("unable to load export plugin", e);
//        } catch (IllegalAccessException e) {
//            logger.fatal("unable to load export plugin", e);
//        }
//
//        if(importPlugin != null && exportPlugin != null) {
//            Properties importProps = cmd.getOptionProperties("import");
//            ImportPluginConfiguration importConfig = ImportPluginConfiguration.getConfigFromProperties(importProps);
//            importPlugin.load(importConfig);
//            ZGif zgif = importPlugin.getZgif();
//            importPlugin.unload();
//
//            Properties exportProps = cmd.getOptionProperties("export");
//            ExportPluginConfiguration exportConfig = ExportPluginConfiguration.getConfigFromProperties(exportProps);
//            exportPlugin.load(exportConfig, zgif);
//            exportPlugin.unload();
//        }
//    }
//
//}
