package org.zgif.converter.plugin.input.csv;

import java.io.InputStream;

import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.model.node.AbstractZGif;

public class NodeConverterDescriptor implements IConverterDescriptor {
	private InputStream csvStream;
	private AbstractZGif zgif;

	public InputStream getCsvStream() {
		return csvStream;
	}

	public void setCsvStream(InputStream csvStream) {
		this.csvStream = csvStream;
	}

    public AbstractZGif getZgif() {
        return zgif;
    }

    public void setZgif(AbstractZGif zgif) {
        this.zgif = zgif;
    }
}
