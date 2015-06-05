package org.zgif.model.node;

import java.util.List;
import java.util.Map;

public class ExtensionMap {

	private String name;

	private Map<String, String> keys;
	private List<ExtensionList> subLists;
	private List<ExtensionMap> subMaps;

	public ExtensionMap() {
		super();
	}

	public ExtensionMap(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getKeys() {
		return keys;
	}

	public void setKeys(Map<String, String> keys) {
		this.keys = keys;
	}

	public List<ExtensionList> getSubLists() {
		return subLists;
	}

	public void setSubLists(List<ExtensionList> subLists) {
		this.subLists = subLists;
	}

	public List<ExtensionMap> getSubMaps() {
		return subMaps;
	}

	public void setSubMaps(List<ExtensionMap> subMaps) {
		this.subMaps = subMaps;
	}

}
