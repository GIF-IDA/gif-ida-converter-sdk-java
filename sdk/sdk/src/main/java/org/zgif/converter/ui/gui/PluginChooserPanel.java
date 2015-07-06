/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
/**
 * 
 */
package org.zgif.converter.ui.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.input.ImportPluginConfiguration;

/**
 * @author phoudek
 * 
 */
public class PluginChooserPanel extends JPanel {

    enum PluginChooserType {
        IMPORT, EXPORT
    }

    public PluginChooserPanel(PluginChooserType type) {
        this.setLayout(new GridBagLayout());

        String word = "Export";
        String[] list = { "shell", "zgif" };
        if (type == PluginChooserType.IMPORT) {
            word = "Import";
            list = (String[]) Arrays.asList("csv").toArray();
        }

        this.add(new JLabel(word + "-Plugin:"), new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4,
            4, 4), 0, 0));
        this.add(new JComboBox(list), new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
            new Insets(4, 4, 4, 4), 0, 0));

        if (type == PluginChooserType.IMPORT) {

            ImportPluginConfiguration emptyConfig = new ImportPluginConfiguration() {
                {
                    Map<String, InputStream> streams = getStreams();
                    streams.put("meta", null);
                    streams.put("periods", null);
                    streams.put("company", null);
                    streams.put("property", null);
                    streams.put("build", null);
                    streams.put("unit", null);
                    streams.put("lease", null);
                    streams.put("term", null);
                }
            };
            PluginComponent<ImportPluginConfiguration> x = new DefaultPluginGui(emptyConfig);
            this.add(x, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
        } else {
            this.add(new JLabel("" + word + "-Plugin wird geladen..."), new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
        }
    }
}
