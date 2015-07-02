package org.zgif.converter.plugin.output;

import java.util.List;

import javax.swing.JComponent;

import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.PluginConfiguration;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractZGif;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface ExportPlugin {

    /**
     * returns the supported subsets of this plugin
     * 
     * @return list of supported subsets
     */
    public List<Subset> getSupportedSubsets();

    /**
     * method triggers the export job
     */
    public void doExport();

    public void load(ExportPluginConfiguration config, AbstractZGif zgif);

    public void unload();

    public PluginComponent<ExportPluginConfiguration> getConfigGui();
}
