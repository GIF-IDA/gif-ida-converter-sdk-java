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
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.03 um 01:14:56 PM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ApartmentType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ApartmentType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="ROOF_STOREY"/>
 *     &lt;enumeration value="LOFT"/>
 *     &lt;enumeration value="MAISONETTE"/>
 *     &lt;enumeration value="PENTHOUSE"/>
 *     &lt;enumeration value="TERRACED_FLAT"/>
 *     &lt;enumeration value="GROUND_FLAT"/>
 *     &lt;enumeration value="APARTMENT"/>
 *     &lt;enumeration value="RAISED_GROUND_FLOOR"/>
 *     &lt;enumeration value="HALF_BASEMENT"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApartmentType")
@XmlEnum
public enum ApartmentType {

    ROOF_STOREY,
    LOFT,
    MAISONETTE,
    PENTHOUSE,
    TERRACED_FLAT,
    GROUND_FLAT,
    APARTMENT,
    RAISED_GROUND_FLOOR,
    HALF_BASEMENT,
    OTHER;

    public String value() {
        return name();
    }

    public static ApartmentType fromValue(String v) {
        return valueOf(v);
    }

}
