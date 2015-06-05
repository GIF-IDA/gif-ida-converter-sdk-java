package org.zgif.model.datatype;

import org.zgif.model.datatype.enumeration.MassUnit;

class Mass {
	private Double value;
	private MassUnit unit;
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double getValue() { 
		return value;
	}
	
	public void setUnit(MassUnit unit) { 
		this.unit = unit;
	}
	
	public MassUnit getUnit() { 
		return this.unit;
	}
}
