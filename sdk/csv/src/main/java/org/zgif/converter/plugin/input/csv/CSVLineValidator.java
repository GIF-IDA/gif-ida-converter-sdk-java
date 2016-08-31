/**
 *
 */
package org.zgif.converter.plugin.input.csv;

import java.util.ArrayList;
import java.util.List;

import org.zgif.converter.sdk.ValidationError;
import org.zgif.converter.sdk.impl.Validator;
import org.zgif.model.node.AbstractNode;

/**
 * @author phoudek
 *
 */
public class CSVLineValidator<Node extends AbstractNode> extends Validator<CSVLine<Node>> {

	/**
	 * @see org.zgif.converter.sdk.impl.Validator#validate(java.lang.Object)
	 */
	@Override
	public List<ValidationError> validate(CSVLine<Node> csvLine) {
		// TODO Auto-generated method stub
		return new ArrayList<ValidationError>();
	}

}
