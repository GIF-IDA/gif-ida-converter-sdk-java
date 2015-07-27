package org.zgif.samples.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Martin Fluegge
 * 
 */
@XmlRootElement
public class Property {

	private Building building;
	private List<Unit> units = new ArrayList<Unit>();

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}
}
