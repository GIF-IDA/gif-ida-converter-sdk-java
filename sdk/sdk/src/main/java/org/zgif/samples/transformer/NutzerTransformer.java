package org.zgif.samples.transformer;

import org.zgif.converter.sdk.ITransformContext;
import org.zgif.converter.sdk.impl.BasicTransformer;
import org.zgif.samples.model.a.Human.Sex;
import org.zgif.samples.model.a.Nutzer;
import org.zgif.samples.model.a.User;

/**
 * @author Martin Fluegge
 * 
 */
public class NutzerTransformer extends BasicTransformer<Nutzer, User> {

	@Override
	protected User doTransform(Nutzer nutzer, ITransformContext context) {
		User user = new User();

		user.setFirstName(nutzer.getVorName());
		user.setLastName(nutzer.getNachName());
		transformSex(nutzer, user);

		return user;
	}

	private void transformSex(Nutzer nutzer, User user) {

		if ("m".equals(nutzer.getGeschlecht())) {
			user.setSex(Sex.MALE);
		} else if ("w".equals(nutzer.getGeschlecht())) {
			user.setSex(Sex.FEMALE);
		} else {
			user.setSex(Sex.UNKNOWN);
		}
	}
}
