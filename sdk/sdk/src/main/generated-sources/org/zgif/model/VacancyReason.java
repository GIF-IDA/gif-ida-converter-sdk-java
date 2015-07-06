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
 * <p>Java-Klasse für VacancyReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VacancyReason">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="MARKET_RELATED"/>
 *     &lt;enumeration value="FUTURE_CONTRACT"/>
 *     &lt;enumeration value="UNECONOMIC"/>
 *     &lt;enumeration value="DEMOLITION"/>
 *     &lt;enumeration value="SALES_RELATED"/>
 *     &lt;enumeration value="TECHNICAL_REASONS"/>
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VacancyReason")
@XmlEnum
public enum VacancyReason {

    MARKET_RELATED,
    FUTURE_CONTRACT,
    UNECONOMIC,
    DEMOLITION,
    SALES_RELATED,
    TECHNICAL_REASONS,
    NOT_SPECIFIED;

    public String value() {
        return name();
    }

    public static VacancyReason fromValue(String v) {
        return valueOf(v);
    }

}