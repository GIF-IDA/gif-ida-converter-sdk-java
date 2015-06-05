package org.zgif.model.subset_4_1;

import java.util.List;

import org.zgif.model.full.entity.Property;
import org.zgif.model.node.AbstractDataRoot;


public class DataRoot extends AbstractDataRoot {
	private List<Property> listOfProp;

	public List<Property> getListOfProp() {
		return listOfProp;
	}

	public void setListOfProp(List<Property> listOfProp) {
		this.listOfProp = listOfProp;
	}
}
