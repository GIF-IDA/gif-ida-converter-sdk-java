/**
 * 
 */
package org.zgif.converter.plugin;

import javax.swing.JComponent;

import org.zgif.converter.plugin.input.ImportPluginConfiguration;

/**
 * @author phoudek
 *
 */
public abstract class PluginComponent<PluginConfig extends PluginConfiguration> extends JComponent {
    abstract public PluginConfig getConfiguration();
}
