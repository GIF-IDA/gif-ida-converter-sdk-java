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
import org.zgif.samples.validator.UserValidator;

/**
 * @author Martin Fluegge
 * 
 */
public class UserToCustomerTransformer extends BasicTransformer<User, Customer> {

	public UserToCustomerTransformer() {
		setValidator(new UserValidator());
	}

	@Override
	protected Customer doTransform(User user, ITransformContext context) {

		Customer customer = new Customer();

		customer.setName(user.getFirstName());
		customer.setLastName(user.getLastName());
		transformGeschlecht(user, customer);

		return customer;
	}

	private void transformGeschlecht(User user, Customer customer) {
		if (Sex.MALE.equals(user.getSex())) {
			customer.setGender("m");
		} else if (Sex.FEMALE.equals(user.getSex())) {
			customer.setGender("w");
		}
	}
}
