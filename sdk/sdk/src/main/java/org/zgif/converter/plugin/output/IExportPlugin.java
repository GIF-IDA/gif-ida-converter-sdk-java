/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Pascal Houdek - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
package org.zgif.converter.plugin.output;

import org.zgif.converter.plugin.IPlugin;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.model.node.ZGif;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface IExportPlugin extends IPlugin {
    public ExportPluginConfiguration getRequiredConfigurationArguments();    
    
    public void load(ExportPluginConfiguration config, ZGif zgif);

    public PluginComponent<ExportPluginConfiguration> getConfigGui();
}
