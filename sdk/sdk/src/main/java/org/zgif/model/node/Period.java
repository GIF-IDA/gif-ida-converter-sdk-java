package org.zgif.model.node;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.zgif.model.datatype.enumeration.PeriodValueType;

public final class Period<T extends AbstractDataRoot> extends AbstractNode {
	private String identifier;
	private LocalDate from;
	private LocalDate to;

	private java.time.Period periodType;

	private PeriodValueType valueType;
	private String valueTypeLabel;

	private T data;

	public String getIdentifier() {
		if (this.identifier == null) {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			this.identifier = df.format(from) + '_' + df.format(to);
		}
		return this.identifier;
	}

	// public static Period of(def year, def month) {
	// new Period(LocalDate.forPeriodStart(year, month),
	// LocalDate.forPeriodEnd(year, month))
	// }
	// public static Period of(def year) {
	// new Period(LocalDate.forPeriodStart(year), LocalDate.forPeriodEnd(year))
	// }
	//
	// public Boolean isThisDateRange(LocalDate startDate, LocalDate endDate) {
	// this.from == startDate && this.to == endDate
	// }

	// @Override
	// public boolean equals(Object arg0) {
	// return arg0 instanceof Period &&
	// this.isThisDateRange(((Period)arg0).from, ((Period)arg0).to)
	// }

	@Override
	public String toString() {
		return getIdentifier();
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}

	public java.time.Period getPeriodType() {
		return periodType;
	}

	public void setPeriodType(java.time.Period periodType) {
		this.periodType = periodType;
	}

	public PeriodValueType getValueType() {
		return valueType;
	}

	public void setValueType(PeriodValueType valueType) {
		this.valueType = valueType;
	}

	public String getValueTypeLabel() {
		return valueTypeLabel;
	}

	public void setValueTypeLabel(String valueTypeLabel) {
		this.valueTypeLabel = valueTypeLabel;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
