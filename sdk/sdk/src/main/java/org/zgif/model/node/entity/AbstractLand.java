package org.zgif.model.node.entity;

import org.zgif.model.annotation.Node;
import org.zgif.model.node.group.Address;

@Node(wikiName="Grundst�ck", parentNodes = {AbstractProperty.class})
public abstract class AbstractLand extends AbstractEntityNode {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
