package org.zgif.converter.plugin.input;

import org.zgif.converter.plugin.Plugin;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.model.node.AbstractZGif;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface ImportPlugin extends Plugin {

    public void load(ImportPluginConfiguration config);
    
    public ImportPluginConfiguration getRequiredConfigurationArguments();
    
    public PluginComponent<ImportPluginConfiguration> getConfigGui();
    
    /**
     * returns the imported zgif object instance type depends of the subset
     * definition in the meta data
     * 
     * @return zgif object
     */
    public AbstractZGif getZgif();
}