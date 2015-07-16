package org.zgif.samples.transformer;

import org.zgif.converter.sdk.ITransformContext;
import org.zgif.converter.sdk.impl.BasicTransformer;
import org.zgif.samples.model.a.Human.Sex;
import org.zgif.samples.model.a.Nutzer;
import org.zgif.samples.model.a.User;
import org.zgif.samples.validator.UserValidator;

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
