package org.zgif.model.node.entity;

import org.zgif.model.annotation.Node;
import org.zgif.model.node.AbstractDataRoot;

@Node(wikiName="Mandanten", parentNodes = {AbstractDataRoot.class})
public abstract class AbstractCompany extends AbstractEntityNode {

	public AbstractCompany() {
	}

}
