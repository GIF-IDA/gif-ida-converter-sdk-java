/**
 * 
 */
package org.zgif.converter.plugin.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.zgif.converter.plugin.PluginConfiguration;

/**
 * @author phoudek
 * 
 */
public class ExportPluginConfiguration extends PluginConfiguration {

    private Map<String, OutputStream> streams = new HashMap<String, OutputStream>();

    /**
     * @author phoudek
     * @param streams
     *            the streams to set
     */
    public void setStreams(Map<String, OutputStream> streams) {
        this.changedAll = true;
        this.streams = streams;
    }

    /**
     * @author phoudek
     * @return the streams
     */
    public Map<String, OutputStream> getStreams() {
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
                this.streams.put(key.substring(9), new FileOutputStream(value.toString()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            super.load(key, value);
        }
    }

    /**
     * converted {@link Properties} object to {@link ExportPluginConfiguration}
     * object
     * 
     * @param props
     *            properties
     * @return export plugin configuration
     */
    public static ExportPluginConfiguration getConfigFromProperties(Properties props) {
        ExportPluginConfiguration config = new ExportPluginConfiguration();

        for (Entry<Object, Object> entry : props.entrySet()) {
            config.load(entry.getKey().toString(), entry.getValue());
        }

        return config;
    }
}
