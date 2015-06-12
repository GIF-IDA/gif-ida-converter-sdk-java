package org.zgif.model.node.entity;

import org.zgif.model.annotation.Node;

@Node(wikiName="Beleg", parentNodes = {AbstractBookEntry.class})
public abstract class AbstractRecord extends AbstractEntityNode {

	public AbstractRecord() {
	}

}
