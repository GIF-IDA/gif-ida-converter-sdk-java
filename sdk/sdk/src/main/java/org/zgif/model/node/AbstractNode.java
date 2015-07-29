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
package org.zgif.model.node;

import org.zgif.model.node.group.ExtensionMap;



public class AbstractNode {
	private ExtensionMap extensionMap = new ExtensionMap();
	
	public AbstractNode() {
	}

	public ExtensionMap getExtensionMap() {
		return extensionMap;
	}
	public void setExtensionMap(ExtensionMap extensionMap) {
		this.extensionMap = extensionMap;
	}
}
