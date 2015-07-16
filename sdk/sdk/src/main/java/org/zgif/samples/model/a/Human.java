package org.zgif.samples.model.a;

/**
 * @author Martin Fluegge
 * 
 */
public class Human {

	private Sex sex;

	public enum Sex {
		MALE, FEMALE, UNKNOWN;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}
}
