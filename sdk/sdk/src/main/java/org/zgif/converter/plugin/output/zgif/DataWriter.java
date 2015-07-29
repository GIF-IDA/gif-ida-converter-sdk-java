/**
 * 
 */
package org.zgif.converter.plugin.output.zgif;

import java.beans.PropertyDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.log4j.Logger;
import org.zgif.model.NodeInformation;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.Area;
import org.zgif.model.node.AbstractNode;
import org.zgif.model.node.Data;
import org.zgif.model.node.group.AbstractGroupNode;

/**
 * @author Pascal Houdek
 * 
 */
public class DataWriter {
    private static Logger   logger = Logger.getLogger(DataWriter.class);
    private OutputStream    outStream;
    private XMLStreamWriter writer;

    private enum WriteRules {
        WRITE_ALWAYS, NO_WRITE_IF_NULL, NO_WRITE_IF_NULl_OR_EMPTY
    }

    /**
     * @author Pascal Houdek
     */
    public DataWriter(OutputStream outStream) {
        this.outStream = outStream;
    }

    public void write(Data data) {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        
        try {
            writer = factory.createXMLStreamWriter(outStream);
            writer.writeStartDocument();

            writeNode(data);

            writer.writeEndDocument();
            writer.flush();
        } catch (Exception e) {
            logger.warn("unknown exception", e);
        }
    }

    private void writeNode(AbstractNode node) throws Exception {
        writer.writeStartElement(getTagnameOfNode(node));

        NodeInformation info = new NodeInformation(node.getClass());
        
        // write attributes:
        List<Field> attributeFields = info.getAttributeFields();
        for (Field field : attributeFields) {
            String fieldName = field.getName();
            Object fieldValue = new PropertyDescriptor(fieldName, node.getClass()).getReadMethod().invoke(node);
            if (fieldValue != null) {
                writeAttribute(fieldName, fieldValue, WriteRules.NO_WRITE_IF_NULL);
            }
        }
        
        // write datafields:
        List<Field> dataFields = info.getDataFields();
        for (Field field : dataFields) {
            String fieldName = field.getName();
            Object fieldValue = new PropertyDescriptor(fieldName, node.getClass()).getReadMethod().invoke(node);
            if (fieldValue != null) {
                writeValue(fieldName, fieldValue, WriteRules.NO_WRITE_IF_NULL);
            }
        }
        
        // write group nodes:
        List<Field> groupnodeFields = info.getGroupNodes();
        for (Field field : groupnodeFields) {
            String fieldName = field.getName();
            Object fieldValue = new PropertyDescriptor(fieldName, node.getClass()).getReadMethod().invoke(node);
            if (fieldValue != null) {
                writeNode((AbstractGroupNode) fieldValue);
            }
        }
        
        // write extention map:
        
        // write sub nodes:
        List<Field> nodelistFields = info.getNodeLists();
        for (Field field : nodelistFields) {
            String fieldName = field.getName();
            Object fieldValue = new PropertyDescriptor(fieldName, node.getClass()).getReadMethod().invoke(node);
            if (fieldValue != null) {
                writeNodes(((Map<String, AbstractNode>)fieldValue).values());
            }
        }
        
        writer.writeEndElement();
    }

    private void writeAttribute(String name, Object value, WriteRules rule) throws XMLStreamException {
        if (rule == WriteRules.WRITE_ALWAYS || (rule == WriteRules.NO_WRITE_IF_NULL && value != null)
            || (rule == WriteRules.NO_WRITE_IF_NULl_OR_EMPTY && value != null)) {
            writeAttribute(name, value);
        }
    }

    private void writeAttribute(String name, Object value) throws XMLStreamException {
        writer.writeAttribute(name, value.toString());
    }

    private void writeValue(String name, Object value, WriteRules rule) throws XMLStreamException {
        if (rule == WriteRules.WRITE_ALWAYS || (rule == WriteRules.NO_WRITE_IF_NULL && value != null)
            || (rule == WriteRules.NO_WRITE_IF_NULl_OR_EMPTY && value != null)) {
            writeValue(name, value);
        }
    }

    private void writeValue(String name, Object value) throws XMLStreamException {
        String setValue = null;
        
        writer.writeStartElement(name);
        if(value instanceof Area) {
            Area area = (Area) value;

            writer.writeAttribute("areaMessurement", area.getAreaMeasurement().toString());
            writer.writeAttribute("areaType", area.getAreaType().toString());
            
            setValue = area.getValue().toString();
        } else if(value instanceof Amount) {
            Amount amount = (Amount) value;

            writer.writeAttribute("currency", amount.getCurrency().toString());
            
            setValue = amount.getValue().toString();
        } else {
            setValue = value.toString();
        }
        
        writer.writeCharacters(setValue);
        writer.writeEndElement();
    }

    private void writeNodes(Collection<AbstractNode> nodes) throws Exception {
        if (nodes != null && !nodes.isEmpty()) {
            Boolean firstNode = true;
            for (AbstractNode node : nodes) {
                if (firstNode) {
                    writer.writeStartElement("LIST_OF_" + getTagnameOfNode(node));
                    firstNode = false;
                }
                writeNode(node);
            }
            writer.writeEndElement();
        }
    }

    private String getTagnameOfNode(AbstractNode node) {
        String simpleName = node.getClass().getSimpleName();
        if (simpleName.equals("DataRoot")) {
            return "data";
        } else if (simpleName.equals("Company")) {
            return "COM";
        } else if (simpleName.equals("Property")) {
            return "PROP";
        } else if (simpleName.equals("Building")) {
            return "BUILD";
        } else if (simpleName.equals("Unit")) {
            return "UNIT";
        } else if (simpleName.equals("Address")) {
            return "address";
        } else {
            return simpleName;
        }
    }
}
