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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für AccountingStandard.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="AccountingStandard">
 *   &lt;restriction base="{}iTYPE_STRING">
 *     &lt;enumeration value="HGB"/>
 *     &lt;enumeration value="UGB"/>
 *     &lt;enumeration value="IFRS"/>
 *     &lt;enumeration value="US_GAAP"/>
 *     &lt;enumeration value="LUX_GAAP"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountingStandard")
@XmlEnum
public enum AccountingStandard {

	HGB, UGB, IFRS, US_GAAP, LUX_GAAP, OTHER;

	public String value() {
		return name();
	}

	public static AccountingStandard fromValue(String v) {
		return valueOf(v);
	}

}
