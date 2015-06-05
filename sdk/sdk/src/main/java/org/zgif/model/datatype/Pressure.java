package org.zgif.model.datatype;

class Pressure {
	private Double value;
		
	public Pressure(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
