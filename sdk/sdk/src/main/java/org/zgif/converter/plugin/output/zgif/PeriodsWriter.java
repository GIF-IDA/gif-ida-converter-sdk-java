///**
// *
// */
//package org.zgif.converter.plugin.output.zgif;
//
//import java.io.OutputStream;
//import java.util.Collection;
//
//import javax.xml.stream.XMLOutputFactory;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamWriter;
//
//import org.apache.log4j.Logger;
//import org.zgif.model.node.Period;
//
///**
// * @author Pascal Houdek
// *
// */
//public class PeriodsWriter {
//	private static Logger logger = Logger.getLogger(PeriodsWriter.class);
//	private OutputStream outStream;
//
//	/**
//	 * @author Pascal Houdek
//	 */
//	public PeriodsWriter(OutputStream outStream) {
//		this.outStream = outStream;
//	}
//
//	public void write(Collection<Period> periods) {
//
//		XMLOutputFactory factory = XMLOutputFactory.newInstance();
//		XMLStreamWriter writer;
//		try {
//			writer = factory.createXMLStreamWriter(outStream);
//			writer.writeStartDocument();
//			writer.writeStartElement("periods");
//
//			for (Period period : periods) {
//				writer.writeStartElement("period");
//				writer.writeAttribute("periodType", period.getPeriodType().toString());
//				writer.writeAttribute("valueType", period.getValueType().toString());
//				if (period.getValueTypeName() != null) {
//					writer.writeAttribute("periodTypeName", period.getValueTypeName());
//				}
//				writer.writeAttribute("from", period.getFrom().toString());
//				writer.writeAttribute("to", period.getTo().toString());
//				writer.writeAttribute("identifier", period.getIdentifier());
//				writer.writeEndElement();
//			}
//
//			writer.writeEndElement();
//			writer.writeEndDocument();
//			writer.flush();
//		} catch (XMLStreamException e) {
//			logger.warn("unknown exception", e);
//		}
//	}
//}
