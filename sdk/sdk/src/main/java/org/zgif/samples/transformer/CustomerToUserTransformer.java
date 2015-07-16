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
package org.zgif.samples.transformer;

import org.zgif.converter.sdk.ITransformContext;
import org.zgif.converter.sdk.impl.BasicTransformer;
import org.zgif.samples.model.a.Customer;
import org.zgif.samples.model.a.Human.Sex;
import org.zgif.samples.model.a.User;

/**
 * @author Martin Fluegge
 * 
 */
public class CustomerToUserTransformer extends BasicTransformer<Customer, User> {

	@Override
	protected User doTransform(Customer customer, ITransformContext context) {
		User user = new User();

		user.setFirstName(customer.getName());
		user.setLastName(customer.getLastName());
		transformSex(customer, user);

		return user;
	}

	private void transformSex(Customer customer, User user) {

		if ("m".equals(customer.getGender())) {
			user.setSex(Sex.MALE);
		} else if ("w".equals(customer.getGender())) {
			user.setSex(Sex.FEMALE);
		} else {
			user.setSex(Sex.UNKNOWN);
		}
	}
}
