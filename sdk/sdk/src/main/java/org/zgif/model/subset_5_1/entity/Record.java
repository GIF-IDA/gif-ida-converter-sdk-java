package org.zgif.model.subset_5_1.entity;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.zgif.model.annotation.DataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.BillStatus;
import org.zgif.model.datatype.enumeration.RecordCategory;
import org.zgif.model.node.entity.AbstractRecord;

public class Record extends AbstractRecord {
	@DataField(wikiPageName = "Belegdatum")
	private LocalDate date;
	@DataField(wikiPageName = "Belegtext")
	private String text;

	@DataField(wikiPageName = "")
	private String groupId;

	@DataField(wikiPageName = "Belegtyp")
	private RecordCategory category;
	@DataField(wikiPageName = "Rechnungsstatus")
	private BillStatus status;
	@DataField(wikiPageName = "Nettobetrag")
	private Amount netValue;
	@DataField(wikiPageName = "Bruttobetrag")
	private Amount grossValue;
	@DataField(wikiPageName = "Mehrwertsteuerbetrag")
	private Amount vatValue;
	@DataField(wikiPageName = "Mehrwertsteuersatz")
	private Double vat;
	@DataField(wikiPageName = "Zahlungsperiode")
	private Period paymentPeriod;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public RecordCategory getCategory() {
		return category;
	}

	public void setCategory(RecordCategory category) {
		this.category = category;
	}

	public BillStatus getStatus() {
		return status;
	}

	public void setStatus(BillStatus status) {
		this.status = status;
	}

	public Amount getNetValue() {
		return netValue;
	}

	public void setNetValue(Amount netValue) {
		this.netValue = netValue;
	}

	public Amount getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(Amount grossValue) {
		this.grossValue = grossValue;
	}

	public Amount getVatValue() {
		return vatValue;
	}

	public void setVatValue(Amount vatValue) {
		this.vatValue = vatValue;
	}

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public Period getPaymentPeriod() {
		return paymentPeriod;
	}

	public void setPaymentPeriod(Period paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}
}
