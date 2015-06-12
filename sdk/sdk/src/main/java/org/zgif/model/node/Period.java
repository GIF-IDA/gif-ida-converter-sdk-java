package org.zgif.model.node;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.enumeration.PeriodValueType;

@Node(parentNodes = { AbstractZGif.class })
public final class Period<T extends AbstractDataRoot> extends AbstractNode {
    @DataField(wikiPageName = "", isObjectIdentifier = true)
    private String               identifier;
    @DataField(wikiPageName = "")
    private LocalDate            from;
    @DataField(wikiPageName = "")
    private LocalDate            to;

    @DataField(wikiPageName = "")
    private org.joda.time.Period periodType;

    @DataField(wikiPageName = "")
    private PeriodValueType      valueType;
    @DataField(wikiPageName = "")
    private String               valueTypeLabel;

    private T                    data;

    // public String getIdentifier() {
    // if (this.identifier == null) {
    // DateTimeFormatter df = DateTimeFormat.forPattern("yyyy-MM-dd");
    // this.identifier = df.print(from) + '_' + df.print(to);
    // }
    // return this.identifier;
    // }

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

    public org.joda.time.Period getPeriodType() {
        return periodType;
    }

    public void setPeriodType(org.joda.time.Period periodType) {
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

    public String getIdentifier() {
        return this.identifier;
    }
}
