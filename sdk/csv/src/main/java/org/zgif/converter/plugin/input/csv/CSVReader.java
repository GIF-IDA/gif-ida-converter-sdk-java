//package org.zgif.converter.plugin.input.csv;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//import org.apache.log4j.Logger;
//import org.zgif.model.node.AbstractNode;
//
///**
// * reader for a csv file
// *
// * @author phoudek
// *
// * @param <NodeType>
// *            type of AbstractNode
// */
//class CSVReader<NodeType extends AbstractNode> {
//    private static Logger   logger       = Logger.getLogger(CSVReader.class);
//
//    private String[]        headerData   = null;
//    private BufferedReader  reader;
//    private Class<NodeType> type;
//
//    private final String    seperateChar = ";(?=([^\\\"]*\\\"[^\\\"]*\\\")*(?![^\\\"]*\\\"))";
//
//    public CSVReader(Class<NodeType> type, InputStream stream) throws IOException, Exception {
//        this.type = type;
//        this.reader = new BufferedReader(new InputStreamReader(stream));
//
//        initialize();
//    }
//
//    private void initialize() throws IOException, Exception {
//        String header = reader.readLine();
//        if (header == null || header.isEmpty()) {
//            logger.error("empty input file");
//        }
//        headerData = header.split(this.seperateChar);
//    }
//
//    /**
//     * reads a csv line
//     * @return csv line object of type <NodeType>
//     * @throws Exception
//     */
//    public CSVLine<NodeType> readLine() throws Exception {
//        String curLine = reader.readLine();
//
//        if (curLine == null || curLine.isEmpty()) {
//            return null;
//        }
//
//        CSVLine<NodeType> result = new CSVLine<NodeType>(type);
//
//        String[] curData = curLine.split(this.seperateChar);
//        for (int i = 0; i < curData.length; i++) {
//            result.put(headerData[i], curData[i]);
//        }
//
//        return result;
//    }
//}
