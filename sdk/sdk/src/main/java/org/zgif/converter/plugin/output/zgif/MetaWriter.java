///**
// *
// */
//package org.zgif.converter.plugin.output.zgif;
//
//import java.io.OutputStream;
//
//import javax.xml.stream.XMLOutputFactory;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamWriter;
//
//import org.apache.log4j.Logger;
//import org.zgif.model.node.Meta;
//
///**
// * @author Pascal Houdek
// *
// */
//public class MetaWriter {
//    private static Logger logger = Logger.getLogger(MetaWriter.class);
//    private OutputStream  outStream;
//
//    /**
//     * @author Pascal Houdek
//     */
//    public MetaWriter(OutputStream outStream) {
//        this.outStream = outStream;
//    }
//
//    public void write(Meta meta) {
//        XMLOutputFactory factory = XMLOutputFactory.newInstance();
//        XMLStreamWriter metaWriter;
//        try {
//            metaWriter = factory.createXMLStreamWriter(outStream);
//            metaWriter.writeStartDocument();
//            metaWriter.writeStartElement("meta");
//
//            metaWriter.writeStartElement("format");
//            metaWriter.writeCharacters(meta.getFormat());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeStartElement("version");
//            metaWriter.writeCharacters(meta.getVersion());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeStartElement("process");
//            metaWriter.writeCharacters(meta.getProcess().toString());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeStartElement("language");
//            metaWriter.writeCharacters(meta.getLanguage().toString());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeStartElement("created");
//            metaWriter.writeCharacters(meta.getCreated().toString());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeStartElement("publisher");
//            metaWriter.writeCharacters(meta.getPublisher());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeStartElement("creator");
//            metaWriter.writeCharacters(meta.getCreator());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeStartElement("description");
//            metaWriter.writeCharacters(meta.getDescription());
//            metaWriter.writeEndElement();
//
//            metaWriter.writeEndDocument();
//            metaWriter.flush();
//        } catch (XMLStreamException e) {
//            logger.warn("unknown exception", e);
//        }
//    }
//}
