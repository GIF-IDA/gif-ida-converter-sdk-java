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

import org.zgif.model.node.AbstractZGif;
import org.zgif.model.node.Period;

public class ZGif extends AbstractZGif {

	DataRoot data;
	Map<String, Period<DataRoot>> periods;

	public ZGif() {
	}

	public DataRoot getData() {
		return data;
	}

	public void setData(DataRoot data) {
		this.data = data;
	}

    public Map<String, Period<DataRoot>> getPeriods() {
        return periods;
    }

    public void setPeriods(Map<String, Period<DataRoot>> periods) {
        this.periods = periods;
    }
}
