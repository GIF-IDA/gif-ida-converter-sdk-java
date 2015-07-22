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
package org.zgif.model.subset_5_1;

import java.util.Map;

import org.zgif.model.annotation.NodeList;
import org.zgif.model.node.AbstractDataRoot;
import org.zgif.model.subset_5_1.entity.Company;
import org.zgif.model.subset_5_1.entity.Property;

public class DataRoot extends AbstractDataRoot {
    @NodeList
	private Map<String, Company> listOfCom;
    @NodeList
    private Map<String, Property> listOfProp;
	
    public Map<String, Company> getListOfCom() {
        return listOfCom;
    }
    public void setListOfCom(Map<String, Company> listOfCom) {
        this.listOfCom = listOfCom;
    }
    public Map<String, Property> getListOfProp() {
        return listOfProp;
    }
    public void setListOfProp(Map<String, Property> listOfProp) {
        this.listOfProp = listOfProp;
    }

}
