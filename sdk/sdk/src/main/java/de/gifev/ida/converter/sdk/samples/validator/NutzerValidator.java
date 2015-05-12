package de.gifev.ida.converter.sdk.samples.validator;

import java.util.ArrayList;
import java.util.List;

import de.gifev.ida.converter.sdk.ValidationError;
import de.gifev.ida.converter.sdk.impl.Validator;
import de.gifev.ida.converter.sdk.samples.model.a.Nutzer;

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
