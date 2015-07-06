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
package org.zgif.model.datatype;

import org.zgif.model.datatype.enumeration.MassUnit;

class Mass {
	private Double value;
	private MassUnit unit;
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double getValue() { 
		return value;
	}
	
	public void setUnit(MassUnit unit) { 
		this.unit = unit;
	}
	
	public MassUnit getUnit() { 
		return this.unit;
	}
}
