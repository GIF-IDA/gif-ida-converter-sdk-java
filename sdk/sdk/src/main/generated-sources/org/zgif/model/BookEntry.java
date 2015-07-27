//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BookEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BookEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingStandard" type="{}AccountingStandard" minOccurs="0"/>
 *         &lt;element name="currency" type="{}iTYPE_CURRENCY" minOccurs="0"/>
 *         &lt;element name="grossValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="netValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="text" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{}TransactionType" minOccurs="0"/>
 *         &lt;element name="vat" type="{}iTYPE_DOUBLE" minOccurs="0"/>
 *         &lt;element name="vatValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *         &lt;element name="hashRecord" type="{}HashRecords" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectIdSender" type="{}iTYPE_STRING" />
 *       &lt;attribute name="objectIdReceiver" type="{}iTYPE_STRING" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookEntry", propOrder = {
    "accountingStandard",
    "currency",
    "grossValue",
    "netValue",
    "text",
    "transactionType",
    "vat",
    "vatValue",
    "extensionMap",
    "hashRecord"
})
public class BookEntry {

    protected AccountingStandard accountingStandard;
    protected String currency;
    protected Amount grossValue;
    protected Amount netValue;
    protected String text;
    protected TransactionType transactionType;
    protected BigDecimal vat;
    protected Amount vatValue;
    protected ExtensionMap extensionMap;
    protected HashRecords hashRecord;
    @XmlAttribute(name = "objectIdSender")
    protected String objectIdSender;
    @XmlAttribute(name = "objectIdReceiver")
    protected String objectIdReceiver;

    /**
     * Ruft den Wert der accountingStandard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStandard }
     *     
     */
    public AccountingStandard getAccountingStandard() {
        return accountingStandard;
    }

    /**
     * Legt den Wert der accountingStandard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStandard }
     *     
     */
    public void setAccountingStandard(AccountingStandard value) {
        this.accountingStandard = value;
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
     * Ruft den Wert der grossValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getGrossValue() {
        return grossValue;
    }

    /**
     * Legt den Wert der grossValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setGrossValue(Amount value) {
        this.grossValue = value;
    }

    /**
     * Ruft den Wert der netValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNetValue() {
        return netValue;
    }

    /**
     * Legt den Wert der netValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNetValue(Amount value) {
        this.netValue = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der transactionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Legt den Wert der transactionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Ruft den Wert der vat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVat() {
        return vat;
    }

    /**
     * Legt den Wert der vat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVat(BigDecimal value) {
        this.vat = value;
    }

    /**
     * Ruft den Wert der vatValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getVatValue() {
        return vatValue;
    }

    /**
     * Legt den Wert der vatValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setVatValue(Amount value) {
        this.vatValue = value;
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
     * Ruft den Wert der hashRecord-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HashRecords }
     *     
     */
    public HashRecords getHashRecord() {
        return hashRecord;
    }

    /**
     * Legt den Wert der hashRecord-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HashRecords }
     *     
     */
    public void setHashRecord(HashRecords value) {
        this.hashRecord = value;
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

}
