package org.zgif.converter.plugin.input.csv;

import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.converter.sdk.ITransformer;
import org.zgif.converter.sdk.impl.BasicConverter;
import org.zgif.model.annotation.DataField;
import org.zgif.model.node.AbstractNode;
import org.zgif.model.node.Period;
import org.zgif.model.subset_5_1.ZGif;

class NodeConverter<A extends AbstractNode> extends BasicConverter {
    private static Logger           logger                 = Logger.getLogger(NodeConverter.class);

    protected Class<A>              type;
    private NodeConverterDescriptor descriptor;

    private Map<String, A>          objectMap              = null;
    private List<A>                 objectList             = null;

    private Method                  objectIdentifierGetter = null;

    public NodeConverter(Class<A> type) {
        this.type = type;

        logger.debug(type);

        List<Field> fields = getAllFieldsOfClass(type);
        for (Field field : fields) {
            DataField anno = field.getAnnotation(DataField.class);
            if (anno != null && anno.isObjectIdentifier()) {
                String fieldName = field.getName();
                try {
                    objectIdentifierGetter = type.getMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
                } catch (NoSuchMethodException | SecurityException e) {
                    logger.info("no identifier getter found for class: " + type);
                }
            }
        }
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

    @SuppressWarnings("unchecked")
    public NodeConverter(Boolean periodWorkaround) {
        this((Class<A>) Period.class);
    }

    @Override
    public void doConvertData(IConverterDescriptor descriptor) {

        this.descriptor = (NodeConverterDescriptor) descriptor;

        convert(this.descriptor.getCsvReader());
    }

    private void convert(Reader reader) {
        CSVReader<A> csvReader;
        try {
            if (objectIdentifierGetter != null) {
                objectMap = new HashMap<String, A>();
            }
            objectList = new ArrayList<A>();

            csvReader = new CSVReader<A>(type, reader);

            for (CSVLine<A> line = csvReader.readLine(); line != null; line = csvReader.readLine()) {
                A obj = getTransformer().transform(line, null);

                if (objectIdentifierGetter != null) {
                    String identifier = (String) objectIdentifierGetter.invoke(obj);

                    objectMap.put(identifier, obj);
                }
                objectList.add(obj);
            }
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public void connectObjectWithZGif(A object, CSVLine<A> csvLine) {
        ZGif zgif = (ZGif) this.descriptor.getZgif();
//        zgif
    }

    @Override
    public ITransformer<CSVLine<A>, A> getTransformer() {
        return new CSV2NodeTransformer<A>(type);
    }

    public Map<String, A> getObjectMap() {
        return objectMap;
    }

    public List<A> getObjectList() {
        return objectList;
    }

}
