package org.zgif.converter.sdk.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.zgif.converter.sdk.ITransformContext;
import org.zgif.converter.sdk.ITransformer;
import org.zgif.converter.sdk.MapperValidationException;
import org.zgif.converter.sdk.ValidationError;

/**
 * @author Martin Fluegge
 * 
 */
public abstract class BasicTransformer<A, B> implements ITransformer<A, B> {

	static final Log LOG = LogFactory.getLog(BasicTransformer.class);
	private boolean validate = true;
	private Validator<A> validator;

	protected abstract B doTransform(A a, ITransformContext context);

	public B transform(A a, ITransformContext context) throws MapperValidationException {

		if (isValidate()) {

			validate(a);
		}

		return doTransform(a, context);
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	protected void validate(A o) throws MapperValidationException {
		Validator<A> validator = getValidator();

		if (validator != null) {

			List<ValidationError> validationResults = validator.validate(o);

			for (ValidationError e : validationResults) {
				LOG.warn(e.getMessage());
			}

			if (validationResults != null && validationResults.size() > 0) {
				throw new MapperValidationException(validationResults);
			}
		}
	}

	public Validator<A> getValidator() {
		return validator;
	}

	public void setValidator(Validator<A> validator) {
		this.validator = validator;
	}
}
