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

import java.util.Currency;

public class Amount {
	private Double value;
	private Currency currency;
	
	public Amount(Double value, Currency currency) {
		this.value = value;
		this.currency = currency;
	}

	public Double getValue() {
		return this.value;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void getCurrency(Currency currency) {
		this.currency = currency;
	}
}
