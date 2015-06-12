package org.zgif.model.node.entity;

import org.zgif.model.annotation.Node;
import org.zgif.model.node.group.Address;

@Node(wikiName="Geb�ude", parentNodes = {AbstractProperty.class})
public abstract class AbstractBuilding extends AbstractEntityNode {

    private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
