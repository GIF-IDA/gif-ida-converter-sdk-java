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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für fTYPE_DATA complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fTYPE_DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="LIST_OF_COM" type="{}Companies"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="LIST_OF_PROP" type="{}Properties"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="LIST_OF_ACC" type="{}Accounts"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fTYPE_DATA", propOrder = {
    "listofcom",
    "listofprop",
    "listofacc"
})
public class FTYPEDATA {

    @XmlElement(name = "LIST_OF_COM")
    protected Companies listofcom;
    @XmlElement(name = "LIST_OF_PROP")
    protected Properties listofprop;
    @XmlElement(name = "LIST_OF_ACC")
    protected Accounts listofacc;

    /**
     * Ruft den Wert der listofcom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Companies }
     *     
     */
    public Companies getLISTOFCOM() {
        return listofcom;
    }

    /**
     * Legt den Wert der listofcom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Companies }
     *     
     */
    public void setLISTOFCOM(Companies value) {
        this.listofcom = value;
    }

    /**
     * Ruft den Wert der listofprop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getLISTOFPROP() {
        return listofprop;
    }

    /**
     * Legt den Wert der listofprop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setLISTOFPROP(Properties value) {
        this.listofprop = value;
    }

    /**
     * Ruft den Wert der listofacc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Accounts }
     *     
     */
    public Accounts getLISTOFACC() {
        return listofacc;
    }

    /**
     * Legt den Wert der listofacc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounts }
     *     
     */
    public void setLISTOFACC(Accounts value) {
        this.listofacc = value;
    }

}
