package org.zgif.model.node.entity;

import org.zgif.model.annotation.WikiEntity;
import org.zgif.model.node.group.Address;

@WikiEntity(name = "Wirtschaftseinheit")
public abstract class AbstractProperty extends AbstractEntityNode {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
