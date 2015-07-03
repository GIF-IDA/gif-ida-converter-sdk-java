//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.03 um 11:52:11 AM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Account complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingStandard" type="{}AccountingStandard" minOccurs="0"/>
 *         &lt;element name="balancePosition" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="value" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="LIST_OF_REC" type="{}Records" minOccurs="0"/>
 *         &lt;element name="LIST_OF_BOOK" type="{}BookEntries" minOccurs="0"/>
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
@XmlType(name = "Account", propOrder = {
    "accountingStandard",
    "balancePosition",
    "value",
    "listofrec",
    "listofbook"
})
public class Account {

    protected AccountingStandard accountingStandard;
    protected String balancePosition;
    protected Amount value;
    @XmlElement(name = "LIST_OF_REC")
    protected Records listofrec;
    @XmlElement(name = "LIST_OF_BOOK")
    protected BookEntries listofbook;
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
     * Ruft den Wert der balancePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalancePosition() {
        return balancePosition;
    }

    /**
     * Legt den Wert der balancePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalancePosition(String value) {
        this.balancePosition = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setValue(Amount value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der listofrec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Records }
     *     
     */
    public Records getLISTOFREC() {
        return listofrec;
    }

    /**
     * Legt den Wert der listofrec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Records }
     *     
     */
    public void setLISTOFREC(Records value) {
        this.listofrec = value;
    }

    /**
     * Ruft den Wert der listofbook-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookEntries }
     *     
     */
    public BookEntries getLISTOFBOOK() {
        return listofbook;
    }

    /**
     * Legt den Wert der listofbook-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookEntries }
     *     
     */
    public void setLISTOFBOOK(BookEntries value) {
        this.listofbook = value;
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
