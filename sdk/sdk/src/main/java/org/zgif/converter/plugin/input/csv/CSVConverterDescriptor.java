package org.zgif.converter.plugin.input.csv;

import java.io.Reader;

public class CSVConverterDescriptor {
	private Reader csvReader;

	public Reader getCsvReader() {
		return csvReader;
	}

	public void setCsvReader(Reader csvReader) {
		this.csvReader = csvReader;
	}
}
