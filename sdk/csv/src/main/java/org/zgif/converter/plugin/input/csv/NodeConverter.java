package org.zgif.converter.plugin.input.csv;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.converter.sdk.ITransformer;
import org.zgif.converter.sdk.impl.BasicConverter;
import org.zgif.model.annotation.DataField;
import org.zgif.model.node.AbstractNode;

/**
 * basic generic converter for every sub object/node of a zgif object, e.g.
 * company, property, unit, lease, ...
 * 
 * @author phoudek
 * @param <Node>
 *            class of the node/sub object type
 */
abstract public class NodeConverter<Node extends AbstractNode> extends BasicConverter {
    private static Logger             logger = Logger.getLogger(NodeConverter.class);

    protected Class<Node>             type;
    protected NodeConverterDescriptor descriptor;

    /**
     * @author phoudek
     * @param type
     *            class of the node/sub object type
     */
    public NodeConverter(Class<Node> type) {
        this.type = type;
    }

    /**
     * @author phoudek
     * @param descriptor
     *            bean that contains Reader for csv data stream and the zgif
     *            object
     * @see BasicConverter#doConvertData(IConverterDescriptor)
     */
    @Override
    public void doConvertData(IConverterDescriptor descriptor) {

        this.descriptor = (NodeConverterDescriptor) descriptor;

        convert(this.descriptor.getCsvStream());
    }

    private void convert(InputStream stream) {
        CSVReader<Node> csvReader;
        try {
            csvReader = new CSVReader<Node>(type, stream);

            for (CSVLine<Node> line = csvReader.readLine(); line != null; line = csvReader.readLine()) {
                CSV2NodeTransformer<Node> transformer = (CSV2NodeTransformer<Node>) getTransformer();
                transformer.setValidator(new CSVLineValidator<Node>());
                transformer.setValidate(true);
                Node obj = transformer.transform(line, null);

                connectObjectWithZGif(obj, line);
            }
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    /**
     * method connects the zgif object from <code>NodeConverterDescriptor</code>
     * with the converted node object of the csvLine
     * 
     * @author phoudek
     * @param object
     *            the converted zgif node object
     * @param csvLine
     *            the original csv data line
     */
    public abstract void connectObjectWithZGif(Node object, CSVLine<Node> csvLine);

    /**
     * @return returns the Transformer for transforming a csv line to a zgif
     *         node object
     * @author phoudek
     */
    @Override
    public ITransformer<CSVLine<Node>, Node> getTransformer() {
        return new CSV2NodeTransformer<Node>(type);
    }

    protected static Method getObjectIdentifierGetter(Class<?> type) {
        Method objectIdentifierGetter = null;

        List<Field> fields = getAllFieldsOfClass(type);
        for (Field field : fields) {
            DataField anno = field.getAnnotation(DataField.class);
            if (anno != null && anno.isObjectIdentifier()) {
                String fieldName = field.getName();
                try {
                    objectIdentifierGetter = type.getMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
                } catch ( SecurityException e) {
                    logger.info("no identifier getter found for class: " + type);
                } catch (NoSuchMethodException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return objectIdentifierGetter;
    }

    private static List<Field> getAllFieldsOfClass(Class<?> clazz) {
        List<Field> fields = new ArrayList<Field>();
        Class<?> current = clazz;
        while (current.getSuperclass() != null) {
            fields.addAll(Arrays.asList(current.getDeclaredFields()));

            current = current.getSuperclass();
        }
        return fields;
    }
}
