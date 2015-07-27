package org.zgif.samples.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Fluegge
 * 
 */
public class Building {
	private List<Unit> units = new ArrayList<Unit>();

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}
}
