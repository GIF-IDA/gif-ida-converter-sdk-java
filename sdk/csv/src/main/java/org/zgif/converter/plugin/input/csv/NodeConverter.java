// package org.zgif.converter.plugin.input.csv;
//
// import java.beans.IntrospectionException;
// import java.beans.PropertyDescriptor;
// import java.io.InputStream;
// import java.lang.reflect.Field;
// import java.lang.reflect.InvocationTargetException;
// import java.lang.reflect.Method;
// import java.lang.reflect.ParameterizedType;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Map;
//
// import org.apache.log4j.Logger;
// import org.zgif.converter.sdk.IConverterDescriptor;
// import org.zgif.converter.sdk.ITransformer;
// import org.zgif.converter.sdk.impl.BasicConverter;
// import org.zgif.model.Information;
// import org.zgif.model.NodeInformation;
// import org.zgif.model.annotation.DataField;
// import org.zgif.model.node.AbstractDataRoot;
// import org.zgif.model.node.AbstractNode;
// import org.zgif.model.node.AbstractZGif;
// import org.zgif.model.node.Period;
//
/// **
// * basic generic converter for every sub object/node of a zgif object, e.g.
// * company, property, unit, lease, ...
// *
// * @author phoudek
// * @param <Node>
// * class of the node/sub object type
// */
// abstract public class NodeConverter<Node extends AbstractNode> extends
// BasicConverter {
// private static Logger logger = Logger.getLogger(NodeConverter.class);
//
// protected Class<Node> type;
// protected NodeConverterDescriptor descriptor;
//
// /**
// * @author phoudek
// * @param type
// * class of the node/sub object type
// */
// public NodeConverter(Class<Node> type) {
// this.type = type;
// }
//
// /**
// * @author phoudek
// * @param descriptor
// * bean that contains Reader for csv data stream and the zgif
// * object
// * @see BasicConverter#doConvertData(IConverterDescriptor)
// */
// @Override
// public void doConvertData(IConverterDescriptor descriptor) {
//
// this.descriptor = (NodeConverterDescriptor) descriptor;
//
// convert(this.descriptor.getCsvStream());
// }
//
// private void convert(InputStream stream) {
// CSVReader<Node> csvReader;
// try {
// csvReader = new CSVReader<Node>(type, stream);
//
// for (CSVLine<Node> line = csvReader.readLine(); line != null; line =
// csvReader.readLine()) {
// CSV2NodeTransformer<Node> transformer = (CSV2NodeTransformer<Node>)
// getTransformer();
// transformer.setValidator(new CSVLineValidator<Node>());
// transformer.setValidate(true);
// Node obj = transformer.transform(line, null);
//
// connectObjectWithZGif(obj, line);
// }
// } catch (Exception e) {
// logger.error("unable to read csv data and transform to model object", e);
// }
// }
//
// /**
// * method connects the zgif object from <code>NodeConverterDescriptor</code>
// * with the converted node object of the csvLine
// *
// * @author phoudek
// * @param object
// * the converted zgif node object
// * @param csvLine
// * the original csv data line
// */
// public void connectObjectWithZGif(Node object, CSVLine<Node> csvLine) {
// try {
// AbstractZGif zgif = descriptor.getZgif();
//
// Map<String, String> originalCSV = csvLine.getOriginalFields();
//
// String periodIdentifier = originalCSV.get("PERIOD.IDENTIFIER");
// AbstractDataRoot root = null;
// if (periodIdentifier != null && !periodIdentifier.isEmpty()) {
// Method getter = new PropertyDescriptor("periods",
// zgif.getClass()).getReadMethod();
//
// Map<String, Period<AbstractDataRoot>> periods = (Map<String,
// Period<AbstractDataRoot>>) getter.invoke(zgif);
// Period<AbstractDataRoot> period = periods.get(periodIdentifier);
// root = period.getData();
// } else {
// Method getter = new PropertyDescriptor("data",
// zgif.getClass()).getReadMethod();
// root = (AbstractDataRoot) getter.invoke(zgif);
// }
//
// Information.getHierarchicalParentClassesOfNode(root.getClass(),
// object.getClass());
//
//// Iterator<Class<?>> parentIterator =
// Arrays.asList(Information.getParentClassesOfNode(object.getClass())).iterator();
//
// System.out.println("=== " + object + " ===");
//
// AbstractNode curParent = root;
// while(curParent != null) {
// System.out.println(root);
// Class<?> nextParentClass = null;//parentIterator.next();
// List<Field> nodeListFields = new
// NodeInformation(curParent.getClass()).getNodeLists();
//
// curParent = null;
// for (Field nodeListField : nodeListFields) {
// ParameterizedType pt = (ParameterizedType) nodeListField.getGenericType();
// String typeName = pt.getActualTypeArguments()[1].toString();
//
// if(typeName.endsWith(nextParentClass.getSimpleName().replaceFirst("Abstract",
// ""))) {
// String typeNameCSV = typeName.substring(typeName.lastIndexOf(".") +
// 1).toUpperCase();
// String nextParentObjectId = originalCSV.get(typeNameCSV +
// ".OBJECT_ID_SENDER");
//
// PropertyDescriptor pd = new PropertyDescriptor(nodeListField.getName(),
// curParent.getClass());
// Method getListMethod = pd.getReadMethod();
// Map<String, AbstractNode> listOfNodes = (Map<String, AbstractNode>)
// getListMethod.invoke(curParent);
// AbstractNode nextParent = listOfNodes.get(nextParentObjectId);
// curParent = nextParent;
// }
// }
// }
// } catch (IntrospectionException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
//
// //
// //
// // String companyObjectId =
// // csvLine.getOriginalFields().get("COMPANY.OBJECT_ID_SENDER");
// //
// // if (companyObjectId == null) {
// // // property without parent company:
// // Map<String, Property> mapOfProp = root.getListOfProp();
// // if (mapOfProp == null) {
// // mapOfProp = new HashMap<String, Property>();
// // root.setListOfProp(mapOfProp);
// // }
// // mapOfProp.put(property.getObjectIdSender(), property);
// // } else {
// // // property with parent company:
// // Map<String, Company> companies = root.getListOfCom();
// // Company company = companies.get(companyObjectId);
// //
// // Map<String, Property> mapOfProp = company.getListOfProp();
// // if (mapOfProp == null) {
// // mapOfProp = new HashMap<String, Property>();
// // company.setListOfProp(mapOfProp);
// // }
// // mapOfProp.put(property.getObjectIdSender(), property);
// // }
// catch (IllegalArgumentException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } catch (IllegalAccessException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } catch (InvocationTargetException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
//
// private List<AbstractNode> getParentPath(AbstractNode curParent, Node object,
// CSVLine<Node> csvLine) throws IntrospectionException,
// IllegalArgumentException, IllegalAccessException, InvocationTargetException {
// List<AbstractNode> result = new ArrayList<AbstractNode>();
//
// System.out.println(Arrays.asList());
//
// if(true)
// return null;
// String targetTypeName = object.getClass().getName();
// Map<String, String> originalCSV = csvLine.getOriginalFields();
//
// List<Field> nodeListFields = new
// NodeInformation(curParent.getClass()).getNodeLists();
// for (Field nodeListField : nodeListFields) {
// ParameterizedType pt = (ParameterizedType) nodeListField.getGenericType();
// String typeName = pt.getActualTypeArguments()[1].toString();
// System.out.println(typeName);
//
// if(typeName.endsWith(targetTypeName)) {
// System.out.println(" - gefunden");
// String typeNameCSV = typeName.substring(typeName.lastIndexOf(".") +
// 1).toUpperCase();
//
// System.out.println(typeNameCSV);
// if (originalCSV.containsKey(typeNameCSV + ".OBJECT_ID_SENDER")) {
// System.out.println(" - gefunden");
// }
// } else {
// PropertyDescriptor pd = new PropertyDescriptor(nodeListField.getName(),
// curParent.getClass());
// Method getListMethod = pd.getReadMethod();
// Map<String, AbstractNode> listOfNodes = (Map<String, AbstractNode>)
// getListMethod.invoke(curParent);
// if(listOfNodes != null) {
// for (AbstractNode possibleParent : listOfNodes.values()) {
// result.addAll(getParentPath(possibleParent, object, csvLine));
// }
// }
// }
//
//
//// String typeNameCSV = typeName.substring(typeName.lastIndexOf(".") +
// 1).toUpperCase();
//// if (originalCSV.containsKey(typeNameCSV + ".OBJECT_ID_SENDER")) {
////
//// System.out.println(typeNameCSV);
//// PropertyDescriptor pd = new PropertyDescriptor(nodeListField.getName(),
// curParent.getClass());
//// Method getListMethod = pd.getReadMethod();
//// Map<String, AbstractNode> listOfNodes = (Map<String, AbstractNode>)
// getListMethod.invoke(curParent);
//// }
// }
//
// return result;
//
// }
//
// /**
// * @return returns the Transformer for transforming a csv line to a zgif
// * node object
// * @author phoudek
// */
// @Override
// public ITransformer<CSVLine<Node>, Node> getTransformer() {
// return new CSV2NodeTransformer<Node>(type);
// }
//
// protected static Method getObjectIdentifierGetter(Class<?> type) {
// Method objectIdentifierGetter = null;
//
// List<Field> fields = getAllFieldsOfClass(type);
// for (Field field : fields) {
// DataField anno = field.getAnnotation(DataField.class);
// if (anno != null && anno.isObjectIdentifier()) {
// String fieldName = field.getName();
// try {
// objectIdentifierGetter = type.getMethod("get" + fieldName.substring(0,
// 1).toUpperCase() + fieldName.substring(1));
// } catch (SecurityException e) {
// logger.info("no identifier getter found for class: " + type);
// } catch (NoSuchMethodException e) {
// logger.info("no identifier getter found for class: " + type);
// }
// }
// }
//
// return objectIdentifierGetter;
// }
//
// private static List<Field> getAllFieldsOfClass(Class<?> clazz) {
// List<Field> fields = new ArrayList<Field>();
// Class<?> current = clazz;
// while (current.getSuperclass() != null) {
// fields.addAll(Arrays.asList(current.getDeclaredFields()));
//
// current = current.getSuperclass();
// }
// return fields;
// }
// }
