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
 * <p>Java-Klasse für OccupancyState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OccupancyState">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="RENTED_AND_OCCUPIED_LEASER"/>
 *     &lt;enumeration value="RENTED_AND_OCCUPIED_OWNER"/>
 *     &lt;enumeration value="RENTED_NOT_OCCUPIED"/>
 *     &lt;enumeration value="OUTSTANDING_RENT_WRITTEN_OFF"/>
 *     &lt;enumeration value="PREARRANGED"/>
 *     &lt;enumeration value="VACANCY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OccupancyState")
@XmlEnum
public enum OccupancyState {

    RENTED_AND_OCCUPIED_LEASER,
    RENTED_AND_OCCUPIED_OWNER,
    RENTED_NOT_OCCUPIED,
    OUTSTANDING_RENT_WRITTEN_OFF,
    PREARRANGED,
    VACANCY;

    public String value() {
        return name();
    }

    public static OccupancyState fromValue(String v) {
        return valueOf(v);
    }

}
