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
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Sector.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Sector">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *     &lt;enumeration value="AUTOMOTIVE"/>
 *     &lt;enumeration value="CARRIYING"/>
 *     &lt;enumeration value="FINANCIAL"/>
 *     &lt;enumeration value="PHARMACEUTICAL"/>
 *     &lt;enumeration value="BUILDING"/>
 *     &lt;enumeration value="CONSUMER_GOODS"/>
 *     &lt;enumeration value="RETAIL"/>
 *     &lt;enumeration value="GASTRONOMY"/>
 *     &lt;enumeration value="INSURANCE"/>
 *     &lt;enumeration value="ENGINEERING_RESOURCES"/>
 *     &lt;enumeration value="TECHNOLOGY"/>
 *     &lt;enumeration value="UTILITIES"/>
 *     &lt;enumeration value="CONSULTING"/>
 *     &lt;enumeration value="AUTHORITIES"/>
 *     &lt;enumeration value="MEDIA"/>
 *     &lt;enumeration value="MEDICAL"/>
 *     &lt;enumeration value="OTHERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Sector")
@XmlEnum
public enum Sector {

    NOT_AVAILABLE,
    AUTOMOTIVE,
    CARRIYING,
    FINANCIAL,
    PHARMACEUTICAL,
    BUILDING,
    CONSUMER_GOODS,
    RETAIL,
    GASTRONOMY,
    INSURANCE,
    ENGINEERING_RESOURCES,
    TECHNOLOGY,
    UTILITIES,
    CONSULTING,
    AUTHORITIES,
    MEDIA,
    MEDICAL,
    OTHERS;

    public String value() {
        return name();
    }

    public static Sector fromValue(String v) {
        return valueOf(v);
    }

}
