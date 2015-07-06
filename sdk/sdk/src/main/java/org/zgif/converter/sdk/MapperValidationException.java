/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
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
