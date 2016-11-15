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
package org.zgif.converter.plugin.input;

import org.zgif.converter.plugin.IPlugin;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.model.node.ZGif;

/**
 * interface for an import plugin
 *
 * @author phoudek
 *
 */
public interface IImportPlugin extends IPlugin {

	public void load(ImportPluginConfiguration config);

	public ImportPluginConfiguration getRequiredConfigurationArguments();

	public PluginComponent<ImportPluginConfiguration> getConfigGui();

	/**
	 * returns the imported zgif object instance type depends of the subset
	 * definition in the meta data
	 *
	 * @return zgif object
	 */
	public ZGif getZgif();
}
