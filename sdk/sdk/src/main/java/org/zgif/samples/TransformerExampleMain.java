package org.zgif.samples;

import java.util.List;

import org.zgif.converter.sdk.MapperValidationException;
import org.zgif.converter.sdk.ValidationError;
import org.zgif.samples.model.a.Human.Sex;
import org.zgif.samples.model.a.Nutzer;
import org.zgif.samples.model.a.User;
import org.zgif.samples.transformer.UserTransformer;

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
