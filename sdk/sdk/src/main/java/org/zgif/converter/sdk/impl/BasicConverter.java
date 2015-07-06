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
package org.zgif.converter.sdk.impl;

import org.zgif.converter.sdk.IConverter;
import org.zgif.converter.sdk.IConverterDescriptor;
import org.zgif.converter.sdk.ITransformer;

/**
 * @author Martin Fluegge
 * 
 */
public abstract class BasicConverter implements IConverter {

	public abstract void doConvertData(IConverterDescriptor descriptor);

	public abstract ITransformer<?, ?> getTransformer();

	public void convertData(IConverterDescriptor descriptor) {

		doConvertData(descriptor);
	}
}
