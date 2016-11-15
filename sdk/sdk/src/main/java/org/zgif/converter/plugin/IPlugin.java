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
public interface IPlugin {
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
