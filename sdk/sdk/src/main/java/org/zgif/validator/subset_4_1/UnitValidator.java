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
