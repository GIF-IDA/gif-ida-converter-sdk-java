package de.gifev.ida.converter.sdk.transformer;

import de.gifev.ida.converter.sdk.ITransformContext;
import de.gifev.ida.converter.sdk.impl.BasicTransformer;
import de.gifev.ida.converter.sdk.samples.model.a.Human.Sex;
import de.gifev.ida.converter.sdk.samples.model.a.Nutzer;
import de.gifev.ida.converter.sdk.samples.model.a.User;
import de.gifev.ida.converter.sdk.samples.validator.UserValidator;

/**
 * @author Martin Fluegge
 * 
 */
public class UserTransformer extends BasicTransformer<User, Nutzer> {

	public UserTransformer() {
		setValidator(new UserValidator());
	}

	@Override
	protected Nutzer doTransform(User user, ITransformContext context) {

		Nutzer nutzer = new Nutzer();

		nutzer.setVorName(user.getFirstName());
		nutzer.setNachName(user.getLastName());
		transformGeschlecht(user, nutzer);

		return nutzer;
	}

	private void transformGeschlecht(User user, Nutzer nutzer) {
		if (Sex.MALE.equals(user.getSex())) {
			nutzer.setGeschlecht("m");
		} else if (Sex.FEMALE.equals(user.getSex())) {
			nutzer.setGeschlecht("w");
		}
	}
}
