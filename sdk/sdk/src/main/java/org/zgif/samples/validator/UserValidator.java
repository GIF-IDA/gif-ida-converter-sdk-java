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
import org.zgif.samples.model.a.Human.Sex;
import org.zgif.samples.model.a.User;

/**
 * @author Martin Fluegge
 * 
 */
public class UserValidator extends Validator<User> {

	@Override
	public List<ValidationError> validate(User user) {
		List<ValidationError> results = new ArrayList<ValidationError>();

		validateFirstName(user, results);
		validateLastName(user, results);
		validateSex(user, results);

		return results;
	}

	private void validateSex(User user, List<ValidationError> results) {
		Sex sex = user.getSex();
		if (!(Sex.MALE == sex || Sex.FEMALE == sex || Sex.UNKNOWN == sex)) {
			createAndAddValidationError(null, "Invalid sex", results);
		}

	}

	private void validateLastName(User user, List<ValidationError> results) {
		if (user.getLastName() == null) {
			createAndAddValidationError(null, "'lastame' must not be null", results);
		}
	}

	private void validateFirstName(User user, List<ValidationError> results) {
		if (user.getFirstName() == null) {
			createAndAddValidationError(null, "'firstname' must not be null", results);
		}
	}
}
