package org.zgif.model.node.entity;

import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.RecordCategory;
import org.zgif.model.datatype.enumeration.BillStatus;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.datatype.enumeration.AccountingStandard;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse f�r Record complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Record">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractEntityNode">
 *       &lt;sequence>
 *         &lt;element name="accountingStandard" type="{}AccountingStandard" minOccurs="0"/>
 *         &lt;element name="category" type="{}RecordCategory" minOccurs="0"/>
 *         &lt;element name="date" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="grossValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="netValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="paymentPeriod" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="status" type="{}BillStatus" minOccurs="0"/>
 *         &lt;element name="text" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="vat" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="vatValue" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="extensionMap" type="{}ExtensionMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
    "accountingStandard",
    "category",
    "date",
    "grossValue",
    "netValue",
    "paymentPeriod",
    "status",
    "text",
    "vat",
    "vatValue",
    "extensionMap"
})
public class Record
    extends AbstractEntityNode
{

    protected AccountingStandard accountingStandard;
    protected RecordCategory category;
    protected String date;
    protected Amount grossValue;
    protected Amount netValue;
    protected Duration paymentPeriod;
    protected BillStatus status;
    protected String text;
    protected Amount vat;
    protected Amount vatValue;

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
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecordCategory }
     *     
     */
    public RecordCategory getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordCategory }
     *     
     */
    public void setCategory(RecordCategory value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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
     * Ruft den Wert der paymentPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPaymentPeriod() {
        return paymentPeriod;
    }

    /**
     * Legt den Wert der paymentPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPaymentPeriod(Duration value) {
        this.paymentPeriod = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BillStatus }
     *     
     */
    public BillStatus getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStatus }
     *     
     */
    public void setStatus(BillStatus value) {
        this.status = value;
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
     * Ruft den Wert der vat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getVat() {
        return vat;
    }

    /**
     * Legt den Wert der vat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setVat(Amount value) {
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
*/

    /**
*/

}
