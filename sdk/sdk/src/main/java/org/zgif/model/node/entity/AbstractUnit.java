package org.zgif.model.node.entity;

import org.zgif.model.annotation.Node;
import org.zgif.model.node.group.Address;

@Node(wikiName="Fl�che/Mieteinheit", parentNodes = {AbstractLand.class, AbstractBuilding.class, AbstractLease.class})
public abstract class AbstractUnit extends AbstractEntityNode {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
