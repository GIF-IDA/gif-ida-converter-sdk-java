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
 * <p>Java-Klasse für AssetAccountType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetAccountType">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="NOT_SPECIFIED"/>
 *     &lt;enumeration value="CURRENT_ASSETS_UNDER_CONSTRUCTION"/>
 *     &lt;enumeration value="CURRENT_LAND_AND_LAND_RIGHTS_WITHOUT_BUILDINGS"/>
 *     &lt;enumeration value="CURRENT_LAND_WITH_BUILDINGS"/>
 *     &lt;enumeration value="CAPITAL_ASSETS_UNDER_CONSTRUCTION"/>
 *     &lt;enumeration value="CAPITAL_BUILDINGS_ON_THIRD_PARTY_LAND"/>
 *     &lt;enumeration value="CAPITAL_LAND_WITH_THIRD_PARTY_LEASEHOLD_RIGHTS"/>
 *     &lt;enumeration value="CAPITAL_LAND_AND_LAND_RIGHTS_WITHOUT_BUILDINGS"/>
 *     &lt;enumeration value="CAPITAL_LAND_AND_LAND_RIGHTS_WITH_COMMERCIAL_AND_OTHER_BUILDINGS"/>
 *     &lt;enumeration value="CAPITAL_LAND_WITH_BUILDINGS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetAccountType")
@XmlEnum
public enum AssetAccountType {

    NOT_SPECIFIED,
    CURRENT_ASSETS_UNDER_CONSTRUCTION,
    CURRENT_LAND_AND_LAND_RIGHTS_WITHOUT_BUILDINGS,
    CURRENT_LAND_WITH_BUILDINGS,
    CAPITAL_ASSETS_UNDER_CONSTRUCTION,
    CAPITAL_BUILDINGS_ON_THIRD_PARTY_LAND,
    CAPITAL_LAND_WITH_THIRD_PARTY_LEASEHOLD_RIGHTS,
    CAPITAL_LAND_AND_LAND_RIGHTS_WITHOUT_BUILDINGS,
    CAPITAL_LAND_AND_LAND_RIGHTS_WITH_COMMERCIAL_AND_OTHER_BUILDINGS,
    CAPITAL_LAND_WITH_BUILDINGS;

    public String value() {
        return name();
    }

    public static AssetAccountType fromValue(String v) {
        return valueOf(v);
    }

}
