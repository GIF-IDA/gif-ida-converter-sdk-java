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
package org.zgif.samples;

import java.util.List;

import org.zgif.converter.sdk.MapperValidationException;
import org.zgif.converter.sdk.ValidationError;
import org.zgif.samples.model.a.Customer;
import org.zgif.samples.model.a.Human.Sex;
import org.zgif.samples.model.a.User;
import org.zgif.samples.transformer.UserToCustomerTransformer;

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

		UserToCustomerTransformer userToCustomerTransformer = new UserToCustomerTransformer();
		userToCustomerTransformer.setValidate(false);
		Customer customer;

		try {
			customer = userToCustomerTransformer.transform(user, null);
		} catch (MapperValidationException e) {
			throw new RuntimeException();
		}

		System.out.println(customer.getName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getGender());

		userToCustomerTransformer.setValidate(true);
		user.setFirstName(null);
		user.setSex(null);

		try {
			customer = userToCustomerTransformer.transform(user, null);
		} catch (MapperValidationException e) {

			List<ValidationError> results = e.getResults();
			for (ValidationError validationError : results) {
				System.out.println(validationError.getMessage());
			}
		}
	}
}
