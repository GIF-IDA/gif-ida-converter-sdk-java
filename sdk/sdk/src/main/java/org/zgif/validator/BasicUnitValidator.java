package org.zgif.validator;

import java.util.ArrayList;
import java.util.List;

import org.zgif.converter.sdk.ValidationError;
import org.zgif.converter.sdk.impl.Validator;
import org.zgif.model.node.entity.AbstractUnit;

public class BasicUnitValidator extends Validator<AbstractUnit> {

	@Override
	public List<ValidationError> validate(AbstractUnit unit) {
		//TODO add global unit validation
		List<ValidationError> results = new ArrayList<ValidationError>();

		validateObjectIdSender(unit, results);
		
		return results;
	}

	private void validateObjectIdSender(AbstractUnit unit, List<ValidationError> results) {
		String objectIdSender = unit.getObjectIdSender();
		if (objectIdSender == null) {
			createAndAddValidationError(null, "objectIdSender must be not null", results);
		}
		if (objectIdSender.length() == 0) {
			createAndAddValidationError(null, "objectIdSender must be not empty", results);
		}
	}
	
}
