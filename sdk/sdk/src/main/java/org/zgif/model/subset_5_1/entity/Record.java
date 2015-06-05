package org.zgif.model.subset_5_1.entity;

import java.time.LocalDate;
import java.time.Period;

import org.zgif.model.annotation.WikiDataField;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.BillStatus;
import org.zgif.model.datatype.enumeration.RecordCategory;
import org.zgif.model.node.entity.AbstractRecord;

public class Record extends AbstractRecord {
	@WikiDataField(pageName = "Belegdatum")
	private LocalDate date;
	@WikiDataField(pageName = "Belegtext")
	private String text;

	@WikiDataField(pageName = "")
	private String groupId;

	@WikiDataField(pageName = "Belegtyp")
	private RecordCategory category;
	@WikiDataField(pageName = "Rechnungsstatus")
	private BillStatus status;
	@WikiDataField(pageName = "Nettobetrag")
	private Amount netValue;
	@WikiDataField(pageName = "Bruttobetrag")
	private Amount grossValue;
	@WikiDataField(pageName = "Mehrwertsteuerbetrag")
	private Amount vatValue;
	@WikiDataField(pageName = "Mehrwertsteuersatz")
	private Double vat;
	@WikiDataField(pageName = "Zahlungsperiode")
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
