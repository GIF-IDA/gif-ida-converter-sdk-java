package org.zgif.model.datatype;

import org.zgif.model.datatype.enumeration.AreaMessurement;
import org.zgif.model.datatype.enumeration.AreaType;

public class Area {
	private Double value;
	private AreaType areaType;
	private AreaMessurement areaMessurement;

	public Area() {
	}

	public Area(Double value, AreaMessurement areaMessurement, AreaType areaType) {
		this.value = value;
		this.areaType = areaType;
		this.areaMessurement = areaMessurement;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public AreaType getAreaType() {
		return areaType;
	}

	public void setAreaType(AreaType areaType) {
		this.areaType = areaType;
	}

	public AreaMessurement getAreaMessurement() {
		return areaMessurement;
	}

	public void setAreaMessurement(AreaMessurement areaMessurement) {
		this.areaMessurement = areaMessurement;
	}

}
