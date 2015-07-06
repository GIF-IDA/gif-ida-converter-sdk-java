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
import java.util.Set;
import java.util.TreeSet;

import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.node.AbstractNode;

public class Information {

    private Information() {
    }

    /**
     * 
     * @param nodeClass
     * @return
     */
    public static Class<?>[] getParentClassesOfNode(Class<?> nodeClass) {
        Node nodeAnno = getAnnotationOfNode(nodeClass);
        if (nodeAnno == null) {
            return null;
        }

        return (Class<?>[]) nodeAnno.parentNodes();
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

        if(nodeClass == null) return null;
        
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
            
            Set<String> identifierDataFields = getIdentifierDatafieldsOfNode(parentNodeClass.getSimpleName().replaceAll("Abstract", "") + ".", parentNodeClass);
            if (identifierDataFields != null) {
                datafieldList.addAll(identifierDataFields);
            }
        }

        return datafieldList;
    }

}
