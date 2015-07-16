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
import org.zgif.samples.model.a.Nutzer;

/**
 * @author Martin Fluegge
 * 
 */
public class NutzerValidator extends Validator<Nutzer> {

	@Override
	public List<ValidationError> validate(Nutzer nutzer) {

		List<ValidationError> results = new ArrayList<ValidationError>();

		validateVorname(nutzer, results);
		validateNachname(nutzer, results);
		validateGeschlecht(nutzer, results);

		return results;
	}

	private void validateGeschlecht(Nutzer nutzer, List<ValidationError> results) {
		String geschlecht = nutzer.getGeschlecht();
		if (!("m".equals(geschlecht) || "w".equals(geschlecht))) {
			createAndAddValidationError(null, "'Geschlecht must be 'm' or 'w''", results);
		}

	}

	private void validateNachname(Nutzer nutzer, List<ValidationError> results) {
		if (nutzer.getNachName() == null) {
			createAndAddValidationError(null, "'Nachname' must not be null", results);
		}
	}

	private void validateVorname(Nutzer nutzer, List<ValidationError> results) {
		if (nutzer.getVorName() == null) {
			createAndAddValidationError(null, "'Vorname' must not be null", results);
		}
	}
}
