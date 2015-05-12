package de.gifev.ida.converter.sdk.samples.validator;

import java.util.ArrayList;
import java.util.List;

import de.gifev.ida.converter.sdk.ValidationError;
import de.gifev.ida.converter.sdk.impl.Validator;
import de.gifev.ida.converter.sdk.samples.model.a.Human.Sex;
import de.gifev.ida.converter.sdk.samples.model.a.User;

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
		if (!(Sex.MALE == sex || Sex.FEMALE == sex || sex.UNKNOWN == sex)) {
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
