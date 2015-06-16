package org.zgif.converter.plugin.input.csv;

import java.io.FileReader;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.zgif.converter.plugin.output.ExportPlugin;
import org.zgif.converter.plugin.output.shellprinter.ShellPrinter;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.subset_5_1.ZGif;

public class TestMain {

    private static Logger logger = Logger.getRootLogger();

    public TestMain() {
    }

    public static void main(String[] args) throws Exception {
        PatternLayout layout = new PatternLayout( "%d{ISO8601} %-5p [%t] %c: %m%n" );
        ConsoleAppender consoleAppender = new ConsoleAppender(layout);
        logger.addAppender(consoleAppender);
        logger.setLevel(Level.ALL);


        ConverterDescriptor convDescRREEF = new ConverterDescriptor();
        convDescRREEF.setCsvReaderMeta(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\RREEF_GIF\\1_HEADER.csv"));
        convDescRREEF.setCsvReaderPeriods(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\RREEF_GIF\\2_PERIODS.csv"));
        convDescRREEF.setCsvReaderCompany(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\RREEF_GIF\\3_Mandant_COM.csv"));
        convDescRREEF.setCsvReaderProperty(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\RREEF_GIF\\4_Wirtschaftseinheit_PROP.csv"));
        convDescRREEF.setCsvReaderBuild(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\RREEF_GIF\\5_Gebaeude_BUILD.csv"));
        convDescRREEF.setSubset(Subset.S5_1);
        

        ConverterDescriptor convDescHandwritten = new ConverterDescriptor();
        convDescHandwritten.setCsvReaderMeta(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\0_HEADER.csv"));
        convDescHandwritten.setCsvReaderPeriods(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\1_PERIODS.csv"));
        convDescHandwritten.setCsvReaderCompany(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\2_COM.csv"));
        convDescHandwritten.setCsvReaderProperty(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\3_PROP.csv"));
        convDescHandwritten.setCsvReaderBuild(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\4_BUILD.csv"));
        convDescHandwritten.setCsvReaderUnit(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\5_UNIT.csv"));
        convDescHandwritten.setCsvReaderLease(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\6_LEASE.csv"));
        convDescHandwritten.setCsvReaderTerm(new FileReader("D:\\workspace\\eclipse\\zgif-converter\\data\\input\\csv\\handwritten\\7_TERM.csv"));
        convDescHandwritten.setSubset(Subset.S5_1);
        
        Converter csvConverter = new Converter();
        csvConverter.convertData(convDescHandwritten);
        ZGif zgif = (ZGif) csvConverter.getZgif();
        
        ExportPlugin sp = new ShellPrinter();
        sp.setZGif(zgif);
        sp.doExport();
    }

}
