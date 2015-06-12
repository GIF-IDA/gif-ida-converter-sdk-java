package org.zgif.converter.plugin.input.csv;

import java.io.Reader;

import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.model.node.AbstractZGif;

public class NodeConverterDescriptor implements IConverterDescriptor {
	private Reader csvReader;
	private AbstractZGif zgif;

	public Reader getCsvReader() {
		return csvReader;
	}

	public void setCsvReader(Reader csvReader) {
		this.csvReader = csvReader;
	}

    public AbstractZGif getZgif() {
        return zgif;
    }

    public void setZgif(AbstractZGif zgif) {
        this.zgif = zgif;
    }
}
