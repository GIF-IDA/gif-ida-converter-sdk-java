package org.zgif.model.subset_5_1;

import java.util.List;

import org.zgif.model.full.entity.Property;
import org.zgif.model.node.AbstractDataRoot;
import org.zgif.model.subset_5_1.entity.Company;

public class DataRoot extends AbstractDataRoot {
	private List<Company> listOfCom;
	private List<Property> listOfProp;

	public List<Company> getListOfCom() {
		return listOfCom;
	}

	public void setListOfCom(List<Company> listOfCom) {
		this.listOfCom = listOfCom;
	}

	public List<Property> getListOfProp() {
		return listOfProp;
	}

	public void setListOfProp(List<Property> listOfProp) {
		this.listOfProp = listOfProp;
	}
}
