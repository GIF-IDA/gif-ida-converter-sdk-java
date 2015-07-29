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
 * <p>Java-Klasse für EnergyRatingType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyRatingType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="USAGE_DEPENDING"/>
 *     &lt;enumeration value="REQUIREMENTS_DEPENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyRatingType")
@XmlEnum
public enum EnergyRatingType {

    USAGE_DEPENDING,
    REQUIREMENTS_DEPENDING;

    public String value() {
        return name();
    }

    public static EnergyRatingType fromValue(String v) {
        return valueOf(v);
    }

}