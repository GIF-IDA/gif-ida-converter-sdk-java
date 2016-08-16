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
package org.zgif.validator;

import org.zgif.converter.sdk.ValidationError;
import org.zgif.converter.sdk.impl.Validator;
import org.zgif.model.node.entity.Unit;

import java.util.ArrayList;
import java.util.List;

public class BasicUnitValidator extends Validator<Unit> {

	@Override
	public List<ValidationError> validate(Unit unit) {
		//TODO add global unit validation
		List<ValidationError> results = new ArrayList<ValidationError>();

		validateObjectIdSender(unit, results);

		return results;
	}

	private void validateObjectIdSender(Unit unit, List<ValidationError> results) {
		String objectIdSender = unit.getObjectIdSender();
		if (objectIdSender == null) {
			createAndAddValidationError(null, "objectIdSender must be not null", results);
		}
		if (objectIdSender.length() == 0) {
			createAndAddValidationError(null, "objectIdSender must be not empty", results);
		}
	}

}
