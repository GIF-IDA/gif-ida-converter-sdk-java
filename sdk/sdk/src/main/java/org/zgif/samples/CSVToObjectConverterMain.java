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

import org.zgif.samples.validator.converter.CSVToObjectConverter;
import org.zgif.samples.validator.converter.CSVToObjectConverter.CSVToObjectConverterDescriptor;

/**
 * @author Martin Fluegge
 * 
 */
public class CSVToObjectConverterMain {

	public static void main(String[] args) {

		CSVToObjectConverter csvToObjectConverter = new CSVToObjectConverter();

		CSVToObjectConverterDescriptor descriptor = new CSVToObjectConverterDescriptor();
		descriptor.setPathToCSV("src/test/resources/user.csv");

		csvToObjectConverter.convertData(descriptor);

	}
}
