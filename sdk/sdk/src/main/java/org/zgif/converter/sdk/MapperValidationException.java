package org.zgif.converter.sdk;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Fluegge
 * 
 *         This class encapsulates a validation and its result. It is thrown
 *         after validation errors are found and collected. Users can collect
 *         the validation result data from the exception.
 */
public class MapperValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	private List<ValidationError> results = new ArrayList<ValidationError>();

	public MapperValidationException(List<ValidationError> validationResults) {
		setResults(validationResults);
	}

	public List<ValidationError> getResults() {
		return results;
	}

	public void setResults(List<ValidationError> results) {
		this.results = results;
	}
}
