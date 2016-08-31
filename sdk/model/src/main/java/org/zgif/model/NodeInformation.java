/**
 *
 */
package org.zgif.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.zgif.model.annotation.DataField;
import org.zgif.model.node.AbstractNode;

/**
 * @author Pascal Houdek
 *
 */
public class NodeInformation {

	private List<Field> fields = new ArrayList<Field>();
	private List<Field> attributeFields;
	private List<Field> dataFields;
	private List<Field> groupNodes;
	private List<Field> nodeLists;

	public NodeInformation(Class<? extends AbstractNode> clazz) {

		collectAllFieldsOfClass(clazz);

		List<Field> attributeFields = new ArrayList<Field>();
		List<Field> dataFields = new ArrayList<Field>();
		List<Field> groupNodes = new ArrayList<Field>();
		List<Field> nodeLists = new ArrayList<Field>();

		for (Field field : this.fields) {
			DataField datafield = field.getAnnotation(DataField.class);
			// GroupNode groupnode = field.getAnnotation(GroupNode.class);
			// NodeList nodeList = field.getAnnotation(NodeList.class);

			if (datafield != null) {
				// if (datafield.isAttribute()) {
				// attributeFields.add(field);
				// } else {
				// dataFields.add(field);
				// }
			}
			// if (groupnode != null) {
			// groupNodes.add(field);
			// }
			// if (nodeList != null) {
			// nodeLists.add(field);
			// }
		}

		this.attributeFields = Collections.unmodifiableList(attributeFields);
		this.dataFields = Collections.unmodifiableList(dataFields);
		this.groupNodes = Collections.unmodifiableList(groupNodes);
		this.nodeLists = Collections.unmodifiableList(nodeLists);
	}

	private void collectAllFieldsOfClass(Class<?> clazz) {
		while (!clazz.equals(Object.class)) {
			Collections.addAll(fields, clazz.getDeclaredFields());

			clazz = clazz.getSuperclass();
		}
	}

	/**
	 * @author Pascal Houdek
	 * @return the attributeFields
	 */
	public List<Field> getAttributeFields() {
		return attributeFields;
	}

	/**
	 * @author Pascal Houdek
	 * @return the dataFields
	 */
	public List<Field> getDataFields() {
		return dataFields;
	}

	/**
	 * @author Pascal Houdek
	 * @return the groupNodes
	 */
	public List<Field> getGroupNodes() {
		return groupNodes;
	}

	/**
	 * @author Pascal Houdek
	 * @return the nodeLists
	 */
	public List<Field> getNodeLists() {
		return nodeLists;
	}

}
