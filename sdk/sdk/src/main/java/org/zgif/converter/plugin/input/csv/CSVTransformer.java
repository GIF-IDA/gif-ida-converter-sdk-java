package org.zgif.converter.plugin.input.csv;

import java.util.Map.Entry;

import org.zgif.converter.sdk.ITransformContext;
import org.zgif.converter.sdk.impl.BasicTransformer;
import org.zgif.model.node.AbstractNode;

public class CSVTransformer<A extends AbstractNode> extends
		BasicTransformer<CSVLine<A>, A> {

	@Override
	protected A doTransform(CSVLine<A> csvLine, ITransformContext context) {

		for (Entry<String, String> datafield : csvLine.entrySet()) {

		}

		return null;
	}

}
