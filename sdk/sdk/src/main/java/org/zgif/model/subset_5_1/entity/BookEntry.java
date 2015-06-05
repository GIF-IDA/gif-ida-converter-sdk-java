package org.zgif.model.subset_5_1.entity;

import java.util.Currency;
import java.util.List;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.TransactionType;
import org.zgif.model.node.entity.AbstractBookEntry;

public class BookEntry extends AbstractBookEntry {
	// TODO:  AccountingStandard accountingStandard - ggf. AccountingType
//	private AccountingStandard accountingStandard

	@WikiDataField(pageName="Währung")
	private Currency currency;
	
	@WikiDataField(pageName="Bruttobetrag")
	private Amount grossValue;

	@WikiDataField(pageName="Nettobetrag")
	private Amount netValue;

	@WikiDataField(pageName="Transaktionstyp")
	private TransactionType transactionType;

	@WikiDataField(pageName="Mehrwertsteuersatz")
	private Double vat;
	@WikiDataField(pageName="Mehrwertsteuerbetrag")
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
