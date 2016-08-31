/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *
 *******************************************************************************/
package org.zgif.model;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.node.AbstractNode;
import org.zgif.model.node.Data;

public class Information {

	private Information() {
	}

	private static Map<Class<? extends Data>, Map<Class<? extends AbstractNode>, List<List<Class<? extends AbstractNode>>>>> allHierarchicalParentClasses = new HashMap<Class<? extends Data>, Map<Class<? extends AbstractNode>, List<List<Class<? extends AbstractNode>>>>>();
	//
	// private static Map<Map<Class<AbstractRoot>,
	// List<List<Class<AbstractNode>>>> allHierarchicalParentClasses = new
	// HashMap<Pair, List<List<Class<AbstractNode>>>>();

	/**
	 *
	 * @param nodeClass
	 * @return
	 */
	public static Class<AbstractNode>[] getParentClassesOfNode(Class<AbstractNode> nodeClass) {
		Node nodeAnno = getAnnotationOfNode(nodeClass);
		if (nodeAnno == null) {
			return null;
		}

		return (Class<AbstractNode>[]) nodeAnno.parentNodes();
	}

	private static void initializeHierarchicalParentClasses(Class<? extends Data> rootClass) {
		Map<Class<? extends AbstractNode>, List<List<Class<AbstractNode>>>> x = new HashMap<Class<? extends AbstractNode>, List<List<Class<AbstractNode>>>>();

		List<Class<? extends AbstractNode>> curWay = new ArrayList<Class<? extends AbstractNode>>();
		curWay.add(rootClass);

		List<Field> nodeListFields = new NodeInformation(rootClass).getNodeLists();
		for (Field nodeListField : nodeListFields) {
			ParameterizedType pt = (ParameterizedType) nodeListField.getGenericType();
			String typeName = pt.getActualTypeArguments()[1].toString().substring(6);

			Class<? extends AbstractNode> curNode;
			try {
				curNode = (Class<? extends AbstractNode>) Class.forName(typeName);
				List<List<Class<AbstractNode>>> way = x.get(curNode);

			} catch (ClassNotFoundException e) {
			}

			/*
			 * if(typeName.endsWith(nextParentClass.getSimpleName().replaceFirst
			 * ("Abstract", ""))) { String typeNameCSV =
			 * typeName.substring(typeName.lastIndexOf(".") + 1).toUpperCase();
			 * String nextParentObjectId = originalCSV.get(typeNameCSV +
			 * ".OBJECT_ID_SENDER");
			 * 
			 * PropertyDescriptor pd = new
			 * PropertyDescriptor(nodeListField.getName(),
			 * curParent.getClass()); Method getListMethod = pd.getReadMethod();
			 * Map<String, AbstractNode> listOfNodes = (Map<String,
			 * AbstractNode>) getListMethod.invoke(curParent); AbstractNode
			 * nextParent = listOfNodes.get(nextParentObjectId); curParent =
			 * nextParent; }
			 */
		}

		// pair.root

		// Class<AbstractNode>[] directParents =
		// getParentClassesOfNode(nodeClass);
		// for (int i = 0; i < directParents.length; i++) {
		// Class<AbstractNode> directParent = directParents[i];
		//
		//// getAllHierarchicalParentClassesOfNode(directParent);
		// }
		//

	}

	public static List<List<Class<? extends AbstractNode>>> getHierarchicalParentClassesOfNode(
			Class<? extends Data> rootClass, Class<? extends AbstractNode> childClass) {

		if (!allHierarchicalParentClasses.containsKey(rootClass)) {
			initializeHierarchicalParentClasses(rootClass);
		}

		return allHierarchicalParentClasses.get(rootClass).get(childClass);
	}

	/**
	 *
	 * @param nodeClass
	 * @return
	 */
	public static Node getAnnotationOfNode(Class<?> nodeClass) {
		Class<?> curClass = nodeClass;
		while (curClass.getAnnotation(Node.class) == null && curClass != Object.class) {
			curClass = curClass.getSuperclass();
		}
		return curClass.getAnnotation(Node.class);
	}

	// ////////////////////////////////////////////////////////

	/**
	 *
	 * @param nodeClass
	 * @return
	 */
	public static Set<String> getDatafieldsOfNode(Class<?> nodeClass) throws Exception {
		if (!AbstractNode.class.isAssignableFrom(nodeClass)) {
			return null;
		}

		return getDatafieldsOfNode("", nodeClass);
	}

	// ////////////////////////////////////////////////////////

	/**
	 *
	 * @param prefix
	 * @param nodeClass
	 * @return
	 * @throws Exception
	 */
	private static Set<String> getDatafieldsOfNode(String prefix, Class<?> nodeClass) throws Exception {
		Set<String> datafieldList = new TreeSet<String>();

		if (getAnnotationOfNode(nodeClass) == null) {
			return null;
		}

		// get data fields (identifier) of parent class
		Set<String> identifierDataFields = getIdentifierDatafieldsOfParentNodes(nodeClass);
		if (identifierDataFields != null) {
			datafieldList.addAll(identifierDataFields);
		}

		// get data fields of super class
		Set<String> superDatafields = getDatafieldsOfNode(nodeClass.getSuperclass());
		if (superDatafields != null) {
			datafieldList.addAll(superDatafields);
		}

		// get data fields of current class
		Field[] fields = nodeClass.getDeclaredFields();
		for (Field field : fields) {
			DataField anno = field.getAnnotation(DataField.class);
			Class<?> fieldClass = field.getType();

			if (anno != null) {
				datafieldList.add(prefix + field.getName());
			} else if (AbstractNode.class.isAssignableFrom(fieldClass)) {
				// get data fields of nested classes
				Set<String> nestedDatafields = getDatafieldsOfNode(fieldClass.getSimpleName() + ".", fieldClass);
				if (nestedDatafields != null) {
					datafieldList.addAll(nestedDatafields);
				}
			}
		}

		return datafieldList;

	}

	/**
	 *
	 * @param prefix
	 * @param nodeClass
	 * @return
	 */
	private static Set<String> getIdentifierDatafieldsOfNode(String prefix, Class<?> nodeClass) {
		Set<String> datafieldList = new TreeSet<String>();

		if (nodeClass == null)
			return null;

		Field[] fields = nodeClass.getDeclaredFields();
		for (Field field : fields) {
			DataField anno = field.getAnnotation(DataField.class);

			if (anno != null && anno.isObjectIdentifier()) {
				datafieldList.add(prefix + field.getName());
			}
		}

		Set<String> superIdentifierDatafields = getIdentifierDatafieldsOfNode(prefix, nodeClass.getSuperclass());
		if (superIdentifierDatafields != null) {
			datafieldList.addAll(superIdentifierDatafields);
		}

		return datafieldList;

	}

	/**
	 *
	 * @param nodeClass
	 * @return
	 */
	private static Set<String> getIdentifierDatafieldsOfParentNodes(Class<?> nodeClass) {
		Set<String> datafieldList = new TreeSet<String>();

		Node nodeAnno = getAnnotationOfNode(nodeClass);
		if (nodeAnno == null) {
			return null;
		}

		Class<?>[] parentNodeClasses = (Class<?>[]) nodeAnno.parentNodes();
		for (int i = 0; i < parentNodeClasses.length; i++) {
			Class<?> parentNodeClass = parentNodeClasses[i];

			Set<String> parentIdentifierDataFields = getIdentifierDatafieldsOfParentNodes(parentNodeClass);
			if (parentIdentifierDataFields != null) {
				datafieldList.addAll(parentIdentifierDataFields);
			}

			Set<String> identifierDataFields = getIdentifierDatafieldsOfNode(
					parentNodeClass.getSimpleName().replaceAll("Abstract", "") + ".", parentNodeClass);
			if (identifierDataFields != null) {
				datafieldList.addAll(identifierDataFields);
			}
		}

		return datafieldList;
	}

}
