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
package org.zgif.model.subset_5_1.entity;

import java.util.List;

import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.node.entity.AbstractAccount;

public class Account extends AbstractAccount {
	// TODO:  AccountingStandard accountingStandard - ggf. AccountingType
//	private AccountingStandard accountingStandard

	@DataField(wikiPageName = "Bilanzposition")
	private String balancePosition;
	
	@DataField(wikiPageName = "Kontobetrag")
	private Amount value;
	
	private List<BookEntry> listOfBook;

	public Amount getValue() {
		return value;
	}

	public void setValue(Amount value) {
		this.value = value;
	}

	public String getBalancePosition() {
		return balancePosition;
	}

	public void setBalancePosition(String balancePosition) {
		this.balancePosition = balancePosition;
	}

	public List<BookEntry> getListOfBook() {
		return listOfBook;
	}

	public void setListOfBook(List<BookEntry> listOfBook) {
		this.listOfBook = listOfBook;
	}
	
}
