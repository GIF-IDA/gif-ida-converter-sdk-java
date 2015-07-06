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
/**
 * 
 */
package org.zgif.converter.ui.shell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.zgif.converter.plugin.input.ImportPlugin;
import org.zgif.converter.plugin.input.ImportPluginConfiguration;
import org.zgif.converter.plugin.output.ExportPlugin;
import org.zgif.converter.plugin.output.ExportPluginConfiguration;
import org.zgif.converter.plugin.output.zgif.ZGifWriter;
import org.zgif.model.node.AbstractZGif;

/**
 * @author phoudek
 * 
 */
public class ShellMain {

    private static Logger logger = Logger.getRootLogger();

    /**
     * @author phoudek
     */
    public ShellMain() {
    }

    public static void dump(Object o) {
        if (o instanceof List) {
            System.out.println(Arrays.asList(o));
        }
        System.out.println(0);
    }

    public static String[] getArgs(String[] args) {

        List<String> listArgs = new ArrayList<String>();

        listArgs.addAll(Arrays.asList("-p", "import=org.zgif.converter.plugin.input.csv.Converter"));
        listArgs.addAll(Arrays.asList("-p", "export=org.zgif.converter.plugin.output.shellprinter.ShellPrinter"));

        listArgs.addAll(Arrays.asList("-i", "filepath-meta=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\0_HEADER.csv"));
        listArgs.addAll(Arrays.asList("-i", "filepath-periods=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\1_PERIODS.csv"));
        listArgs.addAll(Arrays.asList("-i", "filepath-company=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\2_COM.csv"));
        listArgs.addAll(Arrays.asList("-i", "filepath-property=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\3_PROP.csv"));
        listArgs.addAll(Arrays.asList("-i", "filepath-build=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\4_BUILD.csv"));
        listArgs.addAll(Arrays.asList("-i", "filepath-unit=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\5_UNIT.csv"));
        listArgs.addAll(Arrays.asList("-i", "filepath-lease=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\6_LEASE.csv"));
        listArgs.addAll(Arrays.asList("-i", "filepath-term=D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\7_TERM.csv"));

        listArgs.addAll(Arrays.asList("-e", "filepath-zgif=D:\\workspace\\eclipse\\zgif-converter\\data\\output\\zgif\\handwritten.zgif"));

        args = listArgs.toArray(args);
        return args;
    }

    /**
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p [%t] %c: %m%n");
        ConsoleAppender consoleAppender = new ConsoleAppender(layout);
        logger.addAppender(consoleAppender);
        logger.setLevel(Level.ALL);

        args = getArgs(args);

        Options options = new Options();

        Option pluginOption = Option.builder("p").longOpt("plugin").required().argName("plugin=classpath").numberOfArgs(2).valueSeparator()
            .desc("set classpath for plugins (import and export)").build();
        Option importOption = Option.builder("i").longOpt("import").numberOfArgs(2).valueSeparator().desc("config for import plugin").build();
        Option exportOption = Option.builder("e").longOpt("export").numberOfArgs(2).valueSeparator().desc("config for export plugin").build();

        options.addOption(pluginOption);
        options.addOption(importOption);
        options.addOption(exportOption);

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        Properties pluginProps = cmd.getOptionProperties("plugin");
        String importPluginClassName = pluginProps.getProperty("import");
        String exportPluginClassName = pluginProps.getProperty("export");

        ImportPlugin importPlugin = null;
        ExportPlugin exportPlugin = null;
        try {
            importPlugin = (ImportPlugin) Class.forName(importPluginClassName).newInstance();
            exportPlugin = (ExportPlugin) Class.forName(exportPluginClassName).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Properties importProps = cmd.getOptionProperties("import");
        ImportPluginConfiguration importConfig = ImportPluginConfiguration.getConfigFromProperties(importProps);
        importPlugin.load(importConfig);
        AbstractZGif zgif = importPlugin.getZgif();
        importPlugin.unload();

        Properties exportProps = cmd.getOptionProperties("export");
        ExportPluginConfiguration exportConfig = ExportPluginConfiguration.getConfigFromProperties(exportProps);
        exportPlugin.load(exportConfig, zgif);
        exportPlugin.doExport();
        exportPlugin.unload();

        ExportPlugin zgifWriter = new ZGifWriter();
        zgifWriter.load(exportConfig, zgif);
        zgifWriter.doExport();
        zgifWriter.unload();
    }

}
