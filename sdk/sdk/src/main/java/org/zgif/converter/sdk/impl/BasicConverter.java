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
