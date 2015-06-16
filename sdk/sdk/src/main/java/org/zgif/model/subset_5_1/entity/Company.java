package org.zgif.model.subset_5_1.entity;

import java.util.Currency;
import java.util.Map;

import org.zgif.model.annotation.DataField;
import org.zgif.model.node.entity.AbstractCompany;

public class Company extends AbstractCompany {
	@DataField(wikiPageName="W�hrung")
	private Currency currency;

	@DataField(wikiPageName="Notiz")
	private String note;
	
	private Map<String, Property> listOfProp;

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

	public Map<String, Property> getListOfProp() {
		return listOfProp;
	}

	public void setListOfProp(Map<String, Property> listOfProp) {
		this.listOfProp = listOfProp;
	}	
}
