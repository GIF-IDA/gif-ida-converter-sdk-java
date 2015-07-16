package org.zgif.samples.validator.converter;

import org.zgif.converter.sdk.ITransformContext;
import org.zgif.converter.sdk.impl.BasicTransformer;
import org.zgif.samples.model.a.Human.Sex;
import org.zgif.samples.model.a.User;

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
