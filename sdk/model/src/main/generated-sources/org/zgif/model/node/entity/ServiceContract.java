package org.zgif.model.node.entity;

import org.zgif.model.datatype.enumeration.ServiceType;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.LegitTerminationDeadline;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.datatype.enumeration.ContractOption;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für ServiceContract complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceContract">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractEntityNode">
 *       &lt;sequence>
 *         &lt;element name="contractCompletionDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="contractExtensionDuration" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="contractOption" type="{}ContractOption" minOccurs="0"/>
 *         &lt;element name="creditor" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="firstPaymentDate" type="{}iTYPE_LOCALDATE" minOccurs="0"/>
 *         &lt;element name="netAmountPerPayment" type="{}Amount" minOccurs="0"/>
 *         &lt;element name="paymentPattern" type="{}iTYPE_PERIOD" minOccurs="0"/>
 *         &lt;element name="paymentsPerYear" type="{}iTYPE_INTEGER" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{}ServiceType" minOccurs="0"/>
 *         &lt;element name="specifications" type="{}iTYPE_STRING" minOccurs="0"/>
 *         &lt;element name="terminated" type="{}iTYPE_BOOLEAN" minOccurs="0"/>
 *         &lt;element name="terminationLegitDeadline" type="{}LegitTerminationDeadline" minOccurs="0"/>
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
@XmlType(name = "ServiceContract", propOrder = {
    "contractCompletionDate",
    "contractExtensionDuration",
    "contractOption",
    "creditor",
    "firstPaymentDate",
    "netAmountPerPayment",
    "paymentPattern",
    "paymentsPerYear",
    "serviceType",
    "specifications",
    "terminated",
    "terminationLegitDeadline",
    "extensionMap"
})
public class ServiceContract
    extends AbstractEntityNode
{

    protected String contractCompletionDate;
    protected Duration contractExtensionDuration;
    protected ContractOption contractOption;
    protected String creditor;
    protected String firstPaymentDate;
    protected Amount netAmountPerPayment;
    protected Duration paymentPattern;
    protected BigInteger paymentsPerYear;
    protected ServiceType serviceType;
    protected String specifications;
    protected Boolean terminated;
    protected LegitTerminationDeadline terminationLegitDeadline;

    /**
     * Ruft den Wert der contractCompletionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCompletionDate() {
        return contractCompletionDate;
    }

    /**
     * Legt den Wert der contractCompletionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCompletionDate(String value) {
        this.contractCompletionDate = value;
    }

    /**
     * Ruft den Wert der contractExtensionDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getContractExtensionDuration() {
        return contractExtensionDuration;
    }

    /**
     * Legt den Wert der contractExtensionDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setContractExtensionDuration(Duration value) {
        this.contractExtensionDuration = value;
    }

    /**
     * Ruft den Wert der contractOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractOption }
     *     
     */
    public ContractOption getContractOption() {
        return contractOption;
    }

    /**
     * Legt den Wert der contractOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractOption }
     *     
     */
    public void setContractOption(ContractOption value) {
        this.contractOption = value;
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
     * Ruft den Wert der firstPaymentDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPaymentDate() {
        return firstPaymentDate;
    }

    /**
     * Legt den Wert der firstPaymentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPaymentDate(String value) {
        this.firstPaymentDate = value;
    }

    /**
     * Ruft den Wert der netAmountPerPayment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNetAmountPerPayment() {
        return netAmountPerPayment;
    }

    /**
     * Legt den Wert der netAmountPerPayment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNetAmountPerPayment(Amount value) {
        this.netAmountPerPayment = value;
    }

    /**
     * Ruft den Wert der paymentPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPaymentPattern() {
        return paymentPattern;
    }

    /**
     * Legt den Wert der paymentPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPaymentPattern(Duration value) {
        this.paymentPattern = value;
    }

    /**
     * Ruft den Wert der paymentsPerYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentsPerYear() {
        return paymentsPerYear;
    }

    /**
     * Legt den Wert der paymentsPerYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentsPerYear(BigInteger value) {
        this.paymentsPerYear = value;
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
     * Ruft den Wert der terminated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerminated() {
        return terminated;
    }

    /**
     * Legt den Wert der terminated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerminated(Boolean value) {
        this.terminated = value;
    }

    /**
     * Ruft den Wert der terminationLegitDeadline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegitTerminationDeadline }
     *     
     */
    public LegitTerminationDeadline getTerminationLegitDeadline() {
        return terminationLegitDeadline;
    }

    /**
     * Legt den Wert der terminationLegitDeadline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegitTerminationDeadline }
     *     
     */
    public void setTerminationLegitDeadline(LegitTerminationDeadline value) {
        this.terminationLegitDeadline = value;
    }

    /**
*/

    /**
*/

}
