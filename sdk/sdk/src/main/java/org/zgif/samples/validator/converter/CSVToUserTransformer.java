/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
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

		if ("MALE".equals(sex)) {
			user.setSex(Sex.MALE);
		} else if ("FEMALE".equals(sex)) {
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
