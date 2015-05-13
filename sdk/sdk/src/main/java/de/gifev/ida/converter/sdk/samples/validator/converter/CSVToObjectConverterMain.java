package de.gifev.ida.converter.sdk.samples.validator.converter;

import de.gifev.ida.converter.sdk.samples.validator.converter.CSVToObjectConverter.CSVToObjectConverterDescriptor;

/**
 * @author Martin Fluegge
 * 
 */
public class CSVToObjectConverterMain {

	public static void main(String[] args) {

		CSVToObjectConverter csvToObjectConverter = new CSVToObjectConverter();

		CSVToObjectConverterDescriptor descriptor = new CSVToObjectConverterDescriptor();
		descriptor.setPathToCSV("src/test/resources/user.csv");

		csvToObjectConverter.convertData(descriptor);

	}
}
