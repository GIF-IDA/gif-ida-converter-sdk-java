//package org.zgif.converter.plugin.input.csv;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//import org.apache.log4j.Logger;
//import org.zgif.model.Information;
//import org.zgif.model.node.AbstractNode;
//
///**
// * representation of a line in a csv file this object only allows csv data with
// * datafields equally to the datafields of a specific NodeType
// *
// * @author phoudek
// *
// * @param <NodeType>
// *            type of AbstractNode
// */
//public class CSVLine<NodeType extends AbstractNode> extends HashMap<String, String> {
//    @SuppressWarnings("unused")
//    private static Logger                                logger           = Logger.getLogger(CSVLine.class);
//    private static final long                            serialVersionUID = -9068446495268025416L;
//
//    private static Map<Class<AbstractNode>, Set<String>> staticDatafieldMap;
//
//    /**
//     * collects the allowed datafields for a specific NodeType
//     *
//     * @param type
//     * @throws Exception
//     */
//    private static void initializeDatafields(Class<AbstractNode> type) throws Exception {
//        if (staticDatafieldMap == null) {
//            staticDatafieldMap = new HashMap<Class<AbstractNode>, Set<String>>();
//        }
//
//        if (staticDatafieldMap.get(type) == null) {
//            staticDatafieldMap.put(type, Information.getDatafieldsOfNode(type));
//        }
//    }
//
//    // ////////////////////////////
//
//    private Set<String>         datafields;
//    private Map<String, String> originalFields;
//
//    @SuppressWarnings("unchecked")
//    public CSVLine(Class<NodeType> type) throws Exception {
//        initializeDatafields((Class<AbstractNode>) type);
//
//        originalFields = new HashMap<String, String>();
//        datafields = staticDatafieldMap.get(type);
//    }
//
//    /**
//     * @see HashMap#put(Object, Object)
//     */
//    @Override
//    public String put(String key, String value) {
//        originalFields.put(key, value);
//        String keyName = upperCase2CamelCase(key);
//        if (datafields.contains(keyName)) {
//            return super.put(keyName, value);
//        } else {
//            return null;
//        }
//    }
//
//    /**
//     * changes uppercase to camelcase e.g. THIS_IS_AN_EXAMPLE to thisIsAnExample
//     *
//     * @param upperCase
//     *            String in uppercase
//     * @return String in camelcase
//     */
//    private static String upperCase2CamelCase(String upperCase) {
//        StringBuilder sb = new StringBuilder(upperCase.length());
//
//        boolean lastWasUnderscore = upperCase.contains(".");
//        for (int i = 0; i < upperCase.length(); i++) {
//            char curChar = upperCase.charAt(i);
//
//            if (curChar == '_') {
//                lastWasUnderscore = true;
//            } else if (lastWasUnderscore) {
//                sb.append(curChar);
//                lastWasUnderscore = false;
//            } else {
//                sb.append(Character.toLowerCase(curChar));
//            }
//        }
//        return sb.toString();
//    }
//
//    /**
//     * changes camelcase to uppercase e.g. thisIsAnExample to THIS_IS_AN_EXAMPLE
//     *
//     * @param upperCase
//     *            String in camelcase
//     * @return String in uppercase
//     */
//    @SuppressWarnings("unused")
//    private static String camelCase2UpperCase(String camelCase) {
//        return camelCase.replaceAll("(.)(\\p{Upper})", "$1_$2").toUpperCase();
//    }
//
//    /**
//     * Map of all datafields of the csv line, including this datafields/values
//     * not equally to the NodeType
//     *
//     * @return all datafields/values of csv line
//     */
//    public Map<String, String> getOriginalFields() {
//        return Collections.unmodifiableMap(originalFields);
//    }
//
//}
