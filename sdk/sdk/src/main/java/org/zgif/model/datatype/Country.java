package org.zgif.model.datatype;


public class Country {
	private String value;

	public Country() {
	}
	
	public Country(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
