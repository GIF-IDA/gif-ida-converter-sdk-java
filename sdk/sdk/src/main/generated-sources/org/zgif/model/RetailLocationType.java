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
 * <p>Java-Klasse für RetailLocationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailLocationType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="HIGH_STREET"/>
 *     &lt;enumeration value="HIGH_STREET_BORDER_AREA"/>
 *     &lt;enumeration value="CITY_CENTRE_OTHER"/>
 *     &lt;enumeration value="SUBURBAN_CENTRE"/>
 *     &lt;enumeration value="MAJOR_ROUTE"/>
 *     &lt;enumeration value="SUBURBAN_OTHER"/>
 *     &lt;enumeration value="NON_URBAN"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetailLocationType")
@XmlEnum
public enum RetailLocationType {

    HIGH_STREET,
    HIGH_STREET_BORDER_AREA,
    CITY_CENTRE_OTHER,
    SUBURBAN_CENTRE,
    MAJOR_ROUTE,
    SUBURBAN_OTHER,
    NON_URBAN,
    OTHER,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RetailLocationType fromValue(String v) {
        return valueOf(v);
    }

}
