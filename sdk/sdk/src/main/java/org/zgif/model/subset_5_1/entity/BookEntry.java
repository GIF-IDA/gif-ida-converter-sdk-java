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

import java.util.Currency;
import java.util.List;

import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.TransactionType;
import org.zgif.model.node.entity.AbstractBookEntry;

public class BookEntry extends AbstractBookEntry {
	// TODO: AccountingStandard accountingStandard - ggf. AccountingType
	// private AccountingStandard accountingStandard

	@DataField(wikiPageName = "Währung")
	private Currency currency;

	@DataField(wikiPageName = "Bruttobetrag")
	private Amount grossValue;

	@DataField(wikiPageName = "Nettobetrag")
	private Amount netValue;

	@DataField(wikiPageName = "Transaktionstyp")
	private TransactionType transactionType;

	@DataField(wikiPageName = "Mehrwertsteuersatz")
	private Double vat;
	@DataField(wikiPageName = "Mehrwertsteuerbetrag")
	private Amount vatValue;

	private List<Record> listOfRec;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Amount getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(Amount grossValue) {
		this.grossValue = grossValue;
	}

	public Amount getNetValue() {
		return netValue;
	}

	public void setNetValue(Amount netValue) {
		this.netValue = netValue;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public Amount getVatValue() {
		return vatValue;
	}

	public void setVatValue(Amount vatValue) {
		this.vatValue = vatValue;
	}

	public List<Record> getListOfRec() {
		return listOfRec;
	}

	public void setListOfRec(List<Record> listOfRec) {
		this.listOfRec = listOfRec;
	}
}
