package org.zgif.samples.validator.converter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.converter.sdk.ITransformer;
import org.zgif.converter.sdk.MapperValidationException;
import org.zgif.converter.sdk.impl.BasicConverter;
import org.zgif.samples.model.a.User;

/**
 * @author Martin Fluegge
 * 
 */
public class CSVToObjectConverter extends BasicConverter {

	@Override
	public void doConvertData(IConverterDescriptor descriptor) {

		CSVToObjectConverterDescriptor descr = (CSVToObjectConverterDescriptor) descriptor;

		String pathToCSV = descr.getPathToCSV();

		convert(pathToCSV);
	}

	private void convert(String pathToCSV) {

		try {
		    BufferedReader br = new BufferedReader(new FileReader(pathToCSV));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.getProperty("line.separator"));
				line = br.readLine();
				if (line == null) {
					continue;
				}

				User user = getTransformer().transform(line.split(","), null);

				System.out.println(user.getFirstName() + " : " + user.getLastName() + " : " + user.getSex());
			}
			String everything = sb.toString();
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
	public ITransformer<String[], User> getTransformer() {

		return new CSVToUserTransformer();
	}

	public static class CSVToObjectConverterDescriptor implements IConverterDescriptor {
		private String pathToCSV;

		public String getPathToCSV() {
			return pathToCSV;
		}

		public void setPathToCSV(String pathToCSV) {
			this.pathToCSV = pathToCSV;
		}
	}
}
