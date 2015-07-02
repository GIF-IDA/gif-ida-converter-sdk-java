package org.zgif.converter.plugin.input.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.zgif.model.node.AbstractNode;

class CSVReader<A extends AbstractNode> {
    private static Logger  logger       = Logger.getLogger(CSVReader.class);

    private String[]       headerData   = null;
    private BufferedReader reader;
    private Class<A>       type;

    private final String   seperateChar = ";(?=([^\\\"]*\\\"[^\\\"]*\\\")*(?![^\\\"]*\\\"))";

    public CSVReader(Class<A> type, InputStream stream) throws Exception {
        this.type = type;
        this.reader = new BufferedReader(new InputStreamReader(stream));

        initialize();
    }

    private void initialize() throws IOException, Exception {
        String header = reader.readLine();
        if (header == null || header.isEmpty()) {
            logger.error("empty input file");
        }
        headerData = header.split(this.seperateChar);
    }

    public CSVLine<A> readLine() throws Exception {
        String curLine = reader.readLine();

        if (curLine == null || curLine.isEmpty()) {
            return null;
        }

        CSVLine<A> result = new CSVLine<A>(type);

        String[] curData = curLine.split(this.seperateChar);
        for (int i = 0; i < curData.length; i++) {
            result.put(headerData[i], curData[i]);
        }

        return result;
    }
}
