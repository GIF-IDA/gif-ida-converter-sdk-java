package org.zgif.converter.plugin.input.csv;

import java.io.InputStream;

import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.model.node.ZGif;

public class NodeConverterDescriptor implements IConverterDescriptor {
	private InputStream csvStream;
	private ZGif zgif;

	public InputStream getCsvStream() {
		return csvStream;
	}

	public void setCsvStream(InputStream csvStream) {
		this.csvStream = csvStream;
	}

	public ZGif getZgif() {
		return zgif;
	}

	public void setZgif(ZGif zgif) {
		this.zgif = zgif;
	}
}
