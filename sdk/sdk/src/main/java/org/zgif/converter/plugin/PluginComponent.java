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
