/**
 * 
 */
package org.zgif.converter.plugin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

/**
 * @author phoudek
 * 
 */
public class PluginConfiguration {
    
    private Map<String, Boolean> booleans = new HashMap<String, Boolean>();
    private Map<String, Double>  doubles = new HashMap<String, Double>();
    private Map<String, Integer> integers = new HashMap<String, Integer>();
    private Map<String, Object>  objects = new HashMap<String, Object>();
    private Map<String, String>  strings = new HashMap<String, String>();
    protected Map<String, Object>  all        = new HashMap<String, Object>();

    protected boolean              changedAll = false;

    /**
     * @author phoudek
     * @param strings
     *            the strings to set
     */
    public void setStrings(Map<String, String> strings) {
        this.changedAll = true;
        this.strings = strings;
    }

    /**
     * @author phoudek
     * @param integers
     *            the integers to set
     */
    public void setIntegers(Map<String, Integer> integers) {
        this.changedAll = true;
        this.integers = integers;
    }

    /**
     * @author phoudek
     * @param doubles
     *            the doubles to set
     */
    public void setDoubles(Map<String, Double> doubles) {
        this.changedAll = true;
        this.doubles = doubles;
    }

    /**
     * @author phoudek
     * @param booleans
     *            the booleans to set
     */
    public void setBooleans(Map<String, Boolean> booleans) {
        this.changedAll = true;
        this.booleans = booleans;
    }

    /**
     * @author phoudek
     * @param objects
     *            the objects to set
     */
    public void setObjects(Map<String, Object> objects) {
        this.changedAll = true;
        this.objects = objects;
    }

    /**
     * @author phoudek
     * @return the objects
     */
    public Map<String, Object> getObjects() {
        return objects;
    }

    /**
     * @author phoudek
     * @return the strings
     */
    public Map<String, String> getStrings() {
        return strings;
    }

    /**
     * @author phoudek
     * @return the integers
     */
    public Map<String, Integer> getIntegers() {
        return integers;
    }

    /**
     * @author phoudek
     * @return the doubles
     */
    public Map<String, Double> getDoubles() {
        return doubles;
    }

    /**
     * @author phoudek
     * @return the booleans
     */
    public Map<String, Boolean> getBooleans() {
        return booleans;
    }

    /**
     * @author phoudek
     * @return the all
     */
    public Map<String, Object> getAll() {
        if (changedAll) {
            all.clear();

            all.putAll(this.booleans);
            all.putAll(this.doubles);
            all.putAll(this.integers);
            all.putAll(this.objects);
            all.putAll(this.strings);
        }
        return all;
    }
    
    protected void load(String key, Object value) {
        this.objects.put(key, value);
    }

    public static PluginConfiguration getConfigFromProperties(Properties props) {
        PluginConfiguration config = new PluginConfiguration();
        for (Entry<Object, Object> entry : props.entrySet()) {
            String key = entry.getKey().toString();

            // TODO: cast / convert
            config.load(key, entry.getValue());
        }
        
        return config;
    }
}
