package de.gifev.ida.converter.sdk.samples.validator.converter;

import de.gifev.ida.converter.sdk.ITransformContext;
import de.gifev.ida.converter.sdk.impl.BasicTransformer;
import de.gifev.ida.converter.sdk.samples.model.a.Human.Sex;
import de.gifev.ida.converter.sdk.samples.model.a.User;

/**
 * @author Martin Fluegge
 * 
 */
public class CSVToUserTransformer extends BasicTransformer<String[], User> {

	private void transformSex(String sex, User user) {

		if ("m".equals(sex)) {
			user.setSex(Sex.MALE);
		} else if ("w".equals(sex)) {
			user.setSex(Sex.FEMALE);
		} else {
			user.setSex(Sex.UNKNOWN);
		}
	}

	@Override
	protected User doTransform(String[] a, ITransformContext context) {
		User user = new User();

		user.setFirstName(a[0]);
		user.setLastName(a[1]);
		transformSex(a[2], user);

		return user;
	}
}
