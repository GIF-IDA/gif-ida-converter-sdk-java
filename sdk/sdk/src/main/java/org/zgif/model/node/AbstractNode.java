package org.zgif.model.node;


public class AbstractNode {
	private ExtensionMap extensionMap = new ExtensionMap();
	
	public AbstractNode() {
	}

	public ExtensionMap getExtensionMap() {
		return extensionMap;
	}
	public void setExtensionMap(ExtensionMap extensionMap) {
		this.extensionMap = extensionMap;
	}
}
