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

    public void load(PluginConfiguration config);
    
    public void unload();

    public PluginConfiguration getRequiredConfigurationArguments();
}
