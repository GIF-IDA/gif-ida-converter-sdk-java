package de.gifev.ida.converter.sdk.samples;

import java.util.List;

import de.gifev.ida.converter.sdk.MapperValidationException;
import de.gifev.ida.converter.sdk.ValidationError;
import de.gifev.ida.converter.sdk.samples.model.a.Human.Sex;
import de.gifev.ida.converter.sdk.samples.model.a.Nutzer;
import de.gifev.ida.converter.sdk.samples.model.a.User;
import de.gifev.ida.converter.sdk.transformer.UserTransformer;

/**
 * @author Martin Fluegge
 * 
 */
public class TransformerExampleMain {

	public static void main(String[] args) {

		User user = new User();

		user.setFirstName("Martin");
		user.setLastName("Flügge");
		user.setSex(Sex.MALE);

		UserTransformer userTransformer = new UserTransformer();
		userTransformer.setValidate(false);
		Nutzer nutzer;

		try {
			nutzer = userTransformer.transform(user, null);
		} catch (MapperValidationException e) {
			throw new RuntimeException();
		}

		System.out.println(nutzer.getVorName());
		System.out.println(nutzer.getNachName());
		System.out.println(nutzer.getGeschlecht());

		userTransformer.setValidate(true);
		user.setFirstName(null);
		user.setSex(null);

		try {
			nutzer = userTransformer.transform(user, null);
		} catch (MapperValidationException e) {

			List<ValidationError> results = e.getResults();
			for (ValidationError validationError : results) {
				System.out.println(validationError.getMessage());
			}
		}
	}
}
