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
 * <p>Java-Klasse für PortfolioType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PortfolioType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="INSURANCE"/>
 *     &lt;enumeration value="OPEN_PROPERTY_FUND"/>
 *     &lt;enumeration value="PENSIONS_FUND"/>
 *     &lt;enumeration value="REAL_ESTATE_COMPANIES"/>
 *     &lt;enumeration value="UNLISTED_REAL_ESTATE_COMPANIES"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PortfolioType")
@XmlEnum
public enum PortfolioType {

    INSURANCE,
    OPEN_PROPERTY_FUND,
    PENSIONS_FUND,
    REAL_ESTATE_COMPANIES,
    UNLISTED_REAL_ESTATE_COMPANIES,
    OTHER;

    public String value() {
        return name();
    }

    public static PortfolioType fromValue(String v) {
        return valueOf(v);
    }

}
