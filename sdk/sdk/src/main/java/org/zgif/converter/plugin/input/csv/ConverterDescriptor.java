package org.zgif.converter.plugin.input.csv;

import java.io.Reader;

import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.model.datatype.enumeration.Subset;

public class ConverterDescriptor implements IConverterDescriptor {

    private Reader csvReaderMeta;
    private Reader csvReaderPeriods;
    private Reader csvReaderCompany;
    private Reader csvReaderProperty;
    private Reader csvReaderLand;
    private Reader csvReaderBuild;
    private Reader csvReaderLease;
    private Reader csvReaderUnit;
    private Reader csvReaderTerm;
    private Subset subset;
    
    public ConverterDescriptor() {
    }

    public Reader getCsvReaderMeta() {
        return csvReaderMeta;
    }

    public void setCsvReaderMeta(Reader csvReaderMeta) {
        this.csvReaderMeta = csvReaderMeta;
    }

    public Reader getCsvReaderPeriods() {
        return csvReaderPeriods;
    }

    public void setCsvReaderPeriods(Reader csvReaderPeriods) {
        this.csvReaderPeriods = csvReaderPeriods;
    }

    public Reader getCsvReaderCompany() {
        return csvReaderCompany;
    }

    public void setCsvReaderCompany(Reader csvReaderCompany) {
        this.csvReaderCompany = csvReaderCompany;
    }

    public Reader getCsvReaderProperty() {
        return csvReaderProperty;
    }

    public void setCsvReaderProperty(Reader csvReaderProperty) {
        this.csvReaderProperty = csvReaderProperty;
    }

    public Reader getCsvReaderLand() {
        return csvReaderLand;
    }

    public void setCsvReaderLand(Reader csvReaderLand) {
        this.csvReaderLand = csvReaderLand;
    }

    public Reader getCsvReaderBuild() {
        return csvReaderBuild;
    }

    public void setCsvReaderBuild(Reader csvReaderBuild) {
        this.csvReaderBuild = csvReaderBuild;
    }

    public Reader getCsvReaderLease() {
        return csvReaderLease;
    }

    public void setCsvReaderLease(Reader csvReaderLease) {
        this.csvReaderLease = csvReaderLease;
    }

    public Reader getCsvReaderUnit() {
        return csvReaderUnit;
    }

    public void setCsvReaderUnit(Reader csvReaderUnit) {
        this.csvReaderUnit = csvReaderUnit;
    }

    public Reader getCsvReaderTerm() {
        return csvReaderTerm;
    }

    public void setCsvReaderTerm(Reader csvReaderTerm) {
        this.csvReaderTerm = csvReaderTerm;
    }

    public Subset getSubset() {
        return subset;
    }

    public void setSubset(Subset subset) {
        this.subset = subset;
    }
}
