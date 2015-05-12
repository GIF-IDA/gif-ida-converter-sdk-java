package de.gifev.ida.converter.sdk.impl;

import java.util.List;

import de.gifev.ida.converter.sdk.ValidationError;

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