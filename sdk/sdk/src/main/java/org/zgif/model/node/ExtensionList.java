package org.zgif.model.node;

import java.util.ArrayList;

public class ExtensionList extends ArrayList<String> {
	private static final long serialVersionUID = -1044485637956409187L;
	
	private String name;

	public ExtensionList() {
		super();
	}

	public ExtensionList(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}