package org.zgif.model.subset_5_1;

import java.util.Map;

import org.zgif.model.node.AbstractDataRoot;
import org.zgif.model.subset_5_1.entity.Company;
import org.zgif.model.subset_5_1.entity.Property;

public class DataRoot extends AbstractDataRoot {
	private Map<String, Company> listOfCom;
	private Map<String, Property> listOfProp;
	
    public Map<String, Company> getListOfCom() {
        return listOfCom;
    }
    public void setListOfCom(Map<String, Company> listOfCom) {
        this.listOfCom = listOfCom;
    }
    public Map<String, Property> getListOfProp() {
        return listOfProp;
    }
    public void setListOfProp(Map<String, Property> listOfProp) {
        this.listOfProp = listOfProp;
    }

}
