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
package org.zgif.converter.sdk.impl;

import java.util.List;

import org.zgif.converter.sdk.ValidationError;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public abstract class Validator<A> {

	public abstract List<ValidationError> validate(A o);

	protected ValidationError createAndAddValidationError(String objectId, String message, List<ValidationError> results) {
		ValidationError validationError = new ValidationError();
		validationError.setMessage(message);
		validationError.setObjectId(objectId);
		results.add(validationError);
		return validationError;
	}
}