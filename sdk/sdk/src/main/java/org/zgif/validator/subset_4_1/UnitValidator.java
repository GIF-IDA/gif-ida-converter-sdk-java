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
package org.zgif.validator.subset_4_1;

import java.util.List;

import org.zgif.converter.sdk.ValidationError;
import org.zgif.model.node.entity.AbstractUnit;
import org.zgif.model.subset_4_1.entity.Unit;
import org.zgif.validator.BasicUnitValidator;

public class UnitValidator extends BasicUnitValidator {

	@Override
	public List<ValidationError> validate(AbstractUnit unit) {
		return validate((Unit)unit);
	}

	public List<ValidationError> validate(Unit unit) {
		List<ValidationError> errors = super.validate(unit);
		
		//TODO add unit validation for 4.1

		return errors;
	}
}
