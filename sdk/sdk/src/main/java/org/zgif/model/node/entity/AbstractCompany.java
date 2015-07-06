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
package org.zgif.model.node.entity;

import org.zgif.model.annotation.Node;
import org.zgif.model.node.AbstractDataRoot;

@Node(wikiName="Mandanten", parentNodes = {AbstractDataRoot.class})
public abstract class AbstractCompany extends AbstractEntityNode {

	public AbstractCompany() {
	}

}
