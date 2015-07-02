/**
 * 
 */
package org.zgif.converter.plugin;

import javax.swing.JComponent;

/**
 * @author phoudek
 *
 */
public abstract class PluginComponent<PluginConfig extends PluginConfiguration> extends JComponent {
    private static final long serialVersionUID = -6514283473620433014L;

    abstract public PluginConfig getConfiguration();
}
