package org.zgif.converter.sdk;


/**
 * @author Martin Fluegge
 * 
 */
public interface ITransformer<A, B> {

	public B transform(A a, ITransformContext context) throws MapperValidationException;

}
