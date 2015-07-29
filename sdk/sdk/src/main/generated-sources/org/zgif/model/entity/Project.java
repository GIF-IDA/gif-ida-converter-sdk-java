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


package org.zgif.model.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.zgif.model.Address;
import org.zgif.model.Amount;
import org.zgif.model.ExtensionMap;
import org.zgif.model.types.AccountingType;
import org.zgif.model.types.ProjectType;
import org.zgif.model.types.ServiceType;


/**
 * <p>Java-Klasse für Project complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingType" type="{}AccountingType" minOccurs="0"/>
 *         &lt;element name="budget" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="capitalization" type="{}iTYPE_DECIMAL" minOccurs="0"/>
 *         &lt;element name="contractAmount" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="costGroup" type="{}ProjectCostCategory" minOccurs="0"/>
 *         &lt;element name="costTransfer" type="{}iTYPE_DECIMAL" minOccurs="0"/>
 *         &lt;element name="craft" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="creditor" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="currency" type="{}iTYPE_CURRENCY" minOccurs="0"/>
 *         &lt;element name="description" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="invoiceAmount" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="numberOfInvoices" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="projectType" type="{}ProjectType" minOccurs="0"/>
 *         &lt;element name="serviceContractId" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{}ServiceType" minOccurs="0"/>
 *         &lt;element name="specifications" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="address" type="{}Address" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectIdSender" type="{}iTYPE_STRING" />
 *       &lt;attribute name="objectIdReceiver" type="{}iTYPE_STRING" />
 *       &lt;attribute name="validFrom" type="{}iTYPE_LOCALDATE" />
 *       &lt;attribute name="validTo" type="{}iTYPE_LOCALDATE" />
 *       &lt;attribute name="label" type="{}iTYPE_STRING" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "accountingType",
    "budget",
    "capitalization",
    "contractAmount",
    "costGroup",
    "costTransfer",
    "craft",
    "creditor",
    "currency",
    "description",
    "invoiceAmount",
    "numberOfInvoices",
    "projectType",
    "serviceContractId",
    "serviceType",
    "specifications",
    "address",
    "extensionMap"
})
public class Project {

    protected AccountingType accountingType;
    protected Amount budget;
    protected BigDecimal capitalization;
    protected Amount contractAmount;
    protected String costGroup;
    protected BigDecimal costTransfer;
    protected String craft;
    protected String creditor;
    protected String currency;
    protected String description;
    protected Amount invoiceAmount;
    protected BigInteger numberOfInvoices;
    protected ProjectType projectType;
    protected String serviceContractId;
    protected ServiceType serviceType;
    protected String specifications;
    protected Address address;
    protected ExtensionMap extensionMap;
    @XmlAttribute(name = "objectIdSender")
    protected String objectIdSender;
    @XmlAttribute(name = "objectIdReceiver")
    protected String objectIdReceiver;
    @XmlAttribute(name = "validFrom")
    protected String validFrom;
    @XmlAttribute(name = "validTo")
    protected String validTo;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Ruft den Wert der accountingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountingType }
     *     
     */
    public AccountingType getAccountingType() {
        return accountingType;
    }

    /**
     * Legt den Wert der accountingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingType }
     *     
     */
    public void setAccountingType(AccountingType value) {
        this.accountingType = value;
    }

    /**
     * Ruft den Wert der budget-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBudget() {
        return budget;
    }

    /**
     * Legt den Wert der budget-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBudget(Amount value) {
        this.budget = value;
    }

    /**
     * Ruft den Wert der capitalization-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalization() {
        return capitalization;
    }

    /**
     * Legt den Wert der capitalization-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalization(BigDecimal value) {
        this.capitalization = value;
    }

    /**
     * Ruft den Wert der contractAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getContractAmount() {
        return contractAmount;
    }

    /**
     * Legt den Wert der contractAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setContractAmount(Amount value) {
        this.contractAmount = value;
    }

    /**
     * Ruft den Wert der costGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostGroup() {
        return costGroup;
    }

    /**
     * Legt den Wert der costGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostGroup(String value) {
        this.costGroup = value;
    }

    /**
     * Ruft den Wert der costTransfer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostTransfer() {
        return costTransfer;
    }

    /**
     * Legt den Wert der costTransfer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostTransfer(BigDecimal value) {
        this.costTransfer = value;
    }

    /**
     * Ruft den Wert der craft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCraft() {
        return craft;
    }

    /**
     * Legt den Wert der craft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCraft(String value) {
        this.craft = value;
    }

    /**
     * Ruft den Wert der creditor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditor() {
        return creditor;
    }

    /**
     * Legt den Wert der creditor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditor(String value) {
        this.creditor = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der invoiceAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Legt den Wert der invoiceAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setInvoiceAmount(Amount value) {
        this.invoiceAmount = value;
    }

    /**
     * Ruft den Wert der numberOfInvoices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInvoices() {
        return numberOfInvoices;
    }

    /**
     * Legt den Wert der numberOfInvoices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInvoices(BigInteger value) {
        this.numberOfInvoices = value;
    }

    /**
     * Ruft den Wert der projectType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProjectType }
     *     
     */
    public ProjectType getProjectType() {
        return projectType;
    }

    /**
     * Legt den Wert der projectType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectType }
     *     
     */
    public void setProjectType(ProjectType value) {
        this.projectType = value;
    }

    /**
     * Ruft den Wert der serviceContractId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContractId() {
        return serviceContractId;
    }

    /**
     * Legt den Wert der serviceContractId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContractId(String value) {
        this.serviceContractId = value;
    }

    /**
     * Ruft den Wert der serviceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Legt den Wert der serviceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Ruft den Wert der specifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * Legt den Wert der specifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecifications(String value) {
        this.specifications = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der extensionMap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionMap }
     *     
     */
    public ExtensionMap getExtensionMap() {
        return extensionMap;
    }

    /**
     * Legt den Wert der extensionMap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionMap }
     *     
     */
    public void setExtensionMap(ExtensionMap value) {
        this.extensionMap = value;
    }

    /**
     * Ruft den Wert der objectIdSender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdSender() {
        return objectIdSender;
    }

    /**
     * Legt den Wert der objectIdSender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdSender(String value) {
        this.objectIdSender = value;
    }

    /**
     * Ruft den Wert der objectIdReceiver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdReceiver() {
        return objectIdReceiver;
    }

    /**
     * Legt den Wert der objectIdReceiver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdReceiver(String value) {
        this.objectIdReceiver = value;
    }

    /**
     * Ruft den Wert der validFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Legt den Wert der validFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Ruft den Wert der validTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Legt den Wert der validTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(String value) {
        this.validTo = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
