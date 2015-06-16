package org.zgif.converter.plugin.input.csv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.zgif.model.Information;
import org.zgif.model.node.AbstractNode;

public class CSVLine<A extends AbstractNode> extends HashMap<String, String> {
    private static final long                             serialVersionUID = -9068446495268025416L;

    private static Map<Class<AbstractNode>, Set<String>> staticDatafieldMap;

    private static void initializeDatafields(Class<AbstractNode> type) throws Exception {
        if (staticDatafieldMap == null) {
            staticDatafieldMap = new HashMap<Class<AbstractNode>, Set<String>>();
        }

        if (staticDatafieldMap.get(type) == null) {
            staticDatafieldMap.put(type, Information.getDatafieldsOfNode(type));
        }
    }

    // ////////////////////////////

    private Set<String> datafields;
    private Map<String, String> originalFields;

    @SuppressWarnings("unchecked")
    public CSVLine(Class<A> type) throws Exception {
        initializeDatafields((Class<AbstractNode>) type);

        originalFields = new HashMap<String, String>();
        datafields = staticDatafieldMap.get(type);
    }

    @Override
    public String put(String key, String value) {
        originalFields.put(key, value);
        String keyName = upperCase2CamelCase(key);
        if (datafields.contains(keyName)) {
            return super.put(keyName, value);
        } else {
            return null;
        }
    }
    
    private static String upperCase2CamelCase(String upperCase) {
        StringBuilder sb = new StringBuilder(upperCase.length());
        
        boolean lastWasUnderscore = upperCase.contains(".");
        for (int i = 0; i < upperCase.length(); i++) {
            char curChar = upperCase.charAt(i);
            
            if(curChar == '_') {
                lastWasUnderscore = true;
            } else if(lastWasUnderscore) {
                sb.append(curChar);
                lastWasUnderscore = false;
            } else {
                sb.append(Character.toLowerCase(curChar));
            }
        }
        return sb.toString();
    }
    
    private static String camelCase2UpperCase(String camelCase) {
        return camelCase.replaceAll("(.)(\\p{Upper})", "$1_$2").toUpperCase();
    }

    public Map<String, String> getOriginalFields() {
        return Collections.unmodifiableMap(originalFields);
    }
    
    
}
