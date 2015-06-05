package org.zgif.model.subset_5_1.entity;

import java.util.Currency;
import java.util.List;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.node.entity.AbstractCompany;

public class Company extends AbstractCompany {
	@WikiDataField(pageName="Währung")
	private Currency currency;

	@WikiDataField(pageName="Notiz")
	private String note;
	
	private List<Property> listOfProp;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Property> getListOfProp() {
		return listOfProp;
	}

	public void setListOfProp(List<Property> listOfProp) {
		this.listOfProp = listOfProp;
	}
	
	
}
