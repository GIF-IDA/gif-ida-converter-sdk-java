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
package org.zgif.samples.validator;

import java.util.ArrayList;
import java.util.List;

import org.zgif.converter.sdk.ValidationError;
import org.zgif.converter.sdk.impl.Validator;
import org.zgif.samples.model.a.Customer;

/**
 * @author Martin Fluegge
 * 
 */
public class CustomerValidator extends Validator<Customer> {

	@Override
	public List<ValidationError> validate(Customer customer) {

		List<ValidationError> results = new ArrayList<ValidationError>();

		validateVorname(customer, results);
		validateNachname(customer, results);
		validateGeschlecht(customer, results);

		return results;
	}

	private void validateGeschlecht(Customer customer, List<ValidationError> results) {
		String geschlecht = customer.getGender();
		if (!("m".equals(geschlecht) || "w".equals(geschlecht))) {
			createAndAddValidationError(null, "'Gender must be 'm' or 'w''", results);
		}
	}

	private void validateNachname(Customer customer, List<ValidationError> results) {
		if (customer.getLastName() == null) {
			createAndAddValidationError(null, "'Lastname' must not be null", results);
		}
	}

	private void validateVorname(Customer customer, List<ValidationError> results) {
		if (customer.getName() == null) {
			createAndAddValidationError(null, "'name' must not be null", results);
		}
	}
}
