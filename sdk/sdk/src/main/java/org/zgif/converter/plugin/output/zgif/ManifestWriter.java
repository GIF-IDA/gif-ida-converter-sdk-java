/**
 * 
 */
package org.zgif.converter.plugin.output.zgif;

import java.io.OutputStream;
import java.util.List;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.log4j.Logger;

/**
 * @author Pascal Houdek
 * 
 */
public class ManifestWriter {
    private static Logger logger = Logger.getLogger(ManifestWriter.class);
    private OutputStream  outStream;

    /**
     * @author Pascal Houdek
     */
    public ManifestWriter(OutputStream outStream) {
        this.outStream = outStream;
    }

    public void write(List<String> filelist) {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer;
        try {
            writer = factory.createXMLStreamWriter(outStream);
            writer.writeStartDocument();
            writer.writeStartElement("manifest");

            writer.writeStartElement("file-entry");
            writer.writeAttribute("path", "/");
            writer.writeAttribute("mimetype", "application/vnd.gif-ev.zgif");
            writer.writeEndElement();

            for (String fileEntry : filelist) {
                writer.writeStartElement("file-entry");
                writer.writeAttribute("path", fileEntry);
                writer.writeAttribute("mimetype", getMimetype(fileEntry));
                writer.writeEndElement();
            }

            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
        } catch (XMLStreamException e) {
            logger.warn("unknown exception", e);
        }
    }

    private String getMimetype(String path) {
        if (path.endsWith(".xml")) {
            return "text/xml";
        } else {
            return "text/plain";
        }
    }
}
