/**
 * 
 */
package org.zgif.converter.plugin.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.zgif.converter.plugin.PluginConfiguration;

/**
 * @author phoudek
 * 
 */
public class ImportPluginConfiguration extends PluginConfiguration {

    private Map<String, InputStream> streams = new HashMap<String, InputStream>();

    /**
     * @author phoudek
     * @param streams
     *            the streams to set
     */
    public void setStreams(Map<String, InputStream> streams) {
        this.changedAll = true;
        this.streams = streams;
    }

    /**
     * @author phoudek
     * @return the streams
     */
    public Map<String, InputStream> getStreams() {
        return streams;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.PluginConfiguration#getAll()
     */
    @Override
    public Map<String, Object> getAll() {
        Map<String, Object> all = super.getAll();

        all.putAll(this.streams);

        return all;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.PluginConfiguration#load(java.lang.String,
     * java.lang.Object)
     */
    @Override
    protected void load(String key, Object value) {
        if (key.startsWith("filepath-")) {
            try {
                this.streams.put(key.substring(9), new FileInputStream(value.toString()));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            super.load(key, value);
        }
    }

    /**
     * converted {@link Properties} object to {@link ImportPluginConfiguration}
     * object
     * 
     * @param props
     *            properties
     * @return import plugin configuration
     */
    public static ImportPluginConfiguration getConfigFromProperties(Properties props) {
        ImportPluginConfiguration config = new ImportPluginConfiguration();

        for (Entry<Object, Object> entry : props.entrySet()) {
            config.load(entry.getKey().toString(), entry.getValue());
        }

        return config;
    }
}
