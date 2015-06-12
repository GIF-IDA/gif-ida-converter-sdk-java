package org.zgif.model.node.entity;

import org.zgif.model.annotation.Node;

@Node(wikiName="Buchungen", parentNodes = {AbstractAccount.class})
public abstract class AbstractBookEntry extends AbstractEntityNode {

	public AbstractBookEntry() {
	}

}
