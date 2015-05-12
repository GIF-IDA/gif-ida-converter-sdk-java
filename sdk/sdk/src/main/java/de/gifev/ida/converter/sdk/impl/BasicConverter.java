package de.gifev.ida.converter.sdk.impl;

import de.gifev.ida.converter.sdk.IConverter;
import de.gifev.ida.converter.sdk.IConverterDescriptor;
import de.gifev.ida.converter.sdk.ITransformer;

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
