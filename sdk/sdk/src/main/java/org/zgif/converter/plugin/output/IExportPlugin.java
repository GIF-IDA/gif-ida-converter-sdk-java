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

import java.util.List;

import org.zgif.converter.plugin.PluginComponent;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractZGif;

/**
 * interface for an import plugin
 * 
 * @author phoudek
 * 
 */
public interface IExportPlugin {

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
