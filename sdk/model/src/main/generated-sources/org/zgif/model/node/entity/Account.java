package org.zgif.model.node.entity;

import org.zgif.model.node.entity.BookEntries;
import org.zgif.model.datatype.Amount;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.entity.Records;
import org.zgif.model.datatype.enumeration.AccountingStandard;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Account complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractEntityNode">
 *       &lt;sequence>
 *         &lt;element name="accountingStandard" type="{}AccountingStandard" minOccurs="0"/>
 *         &lt;element name="balancePosition" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="value" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="records" type="{}Records" minOccurs="0"/>
 *         &lt;element name="bookEntries" type="{}BookEntries" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
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
    "records",
    "bookEntries"
})
public class Account
    extends AbstractEntityNode
{

    protected AccountingStandard accountingStandard;
    protected String balancePosition;
    protected Amount value;
    protected Records records;
    protected BookEntries bookEntries;

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
     * Ruft den Wert der records-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Records }
     *     
     */
    public Records getRecords() {
        return records;
    }

    /**
     * Legt den Wert der records-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Records }
     *     
     */
    public void setRecords(Records value) {
        this.records = value;
    }

    /**
     * Ruft den Wert der bookEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookEntries }
     *     
     */
    public BookEntries getBookEntries() {
        return bookEntries;
    }

    /**
     * Legt den Wert der bookEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookEntries }
     *     
     */
    public void setBookEntries(BookEntries value) {
        this.bookEntries = value;
    }

}
