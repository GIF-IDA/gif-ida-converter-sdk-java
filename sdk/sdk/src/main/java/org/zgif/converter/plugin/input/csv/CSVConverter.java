package org.zgif.converter.plugin.input.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.converter.sdk.ITransformer;
import org.zgif.converter.sdk.MapperValidationException;
import org.zgif.converter.sdk.impl.BasicConverter;
import org.zgif.model.node.AbstractNode;

public class CSVConverter<A extends AbstractNode> extends BasicConverter {
	Class<A> type;

	public CSVConverter(Class<A> type) {
		this.type = type;
	}

	@Override
	public void doConvertData(IConverterDescriptor descriptor) {

		CSVConverterDescriptor descr = (CSVConverterDescriptor) descriptor;

		convert(descr.getCsvReader());
	}

	private void convert(Reader pathToCSV) {

		try (BufferedReader br = new BufferedReader(pathToCSV)) {
			String header = br.readLine();
			header.split(";");
			
			
			String line;
			do {
				line = br.readLine();
				if (line == null) {
					break;
				}
				
				CSVLine<A> csvLine = new CSVLine<A>(this.type);
				csvLine.put("", "");
				//...
				
				getTransformer().transform(csvLine, null);
				

			} while(line != null);
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		} catch (IOException e) {
			throw new RuntimeException();
		} catch (MapperValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ITransformer<CSVLine<A>, A> getTransformer() {
		return new CSVTransformer<A>();
	}

}
