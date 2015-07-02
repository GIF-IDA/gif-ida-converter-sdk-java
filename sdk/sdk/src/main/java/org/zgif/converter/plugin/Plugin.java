/**
 * 
 */
package org.zgif.converter.plugin;

import java.util.List;

import org.zgif.model.datatype.enumeration.Subset;

/**
 * @author phoudek
 * 
 */
public interface Plugin {
    /**
     * returns the supported subsets of this plugin
     * 
     * @return list of supported subsets
     */
    public List<Subset> getSupportedSubsets();

    /**
     * called on startup of the plugin
     * 
     * @param config
     *            configuration for the plugin
     */
    public void load(PluginConfiguration config);

    /**
     * called after the plugin was used
     */
    public void unload();

    /**
     * returns the required configuration arguments. maps of the returned
     * {@link PluginConfiguration} must have keys without values
     * 
     * @return emptry config of required configuration
     */
    public PluginConfiguration getRequiredConfigurationArguments();
}
