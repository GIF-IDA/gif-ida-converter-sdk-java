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
package org.zgif.model.datatype.enumeration;

public enum AssetAccountType {
	NOT_SPECIFIED,

	CURRENT_ASSETS_UNDER_CONSTRUCTION, CURRENT_LAND_AND_LAND_RIGHTS_WITHOUT_BUILDINGS, CURRENT_LAND_WITH_BUILDINGS,
	
	CAPITAL_ASSETS_UNDER_CONSTRUCTION, CAPITAL_BUILDINGS_ON_THIRD_PARTY_LAND, CAPITAL_LAND_WITH_THIRD_PARTY_LEASEHOLD_RIGHTS,
	CAPITAL_LAND_AND_LAND_RIGHTS_WITHOUT_BUILDINGS, CAPITAL_LAND_AND_LAND_RIGHTS_WITH_COMMERCIAL_AND_OTHER_BUILDINGS,
	CAPITAL_LAND_WITH_BUILDINGS
}
