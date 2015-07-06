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

import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;

public class Area {
	private Double value;
	private AreaType areaType;
	private AreaMessurement areaMessurement;

	public Area() {
	}

	public Area(Double value, AreaMessurement areaMessurement, AreaType areaType) {
		this.value = value;
		this.areaType = areaType;
		this.areaMessurement = areaMessurement;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public AreaType getAreaType() {
		return areaType;
	}

	public void setAreaType(AreaType areaType) {
		this.areaType = areaType;
	}

	public AreaMessurement getAreaMessurement() {
		return areaMessurement;
	}

	public void setAreaMessurement(AreaMessurement areaMessurement) {
		this.areaMessurement = areaMessurement;
	}

}
