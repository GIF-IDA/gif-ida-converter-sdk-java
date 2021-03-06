package org.zgif.model.node.entity;

import org.zgif.model.datatype.enumeration.AccountingType;
import org.zgif.model.node.group.Address;
import org.zgif.model.datatype.enumeration.ServiceType;
import org.zgif.model.datatype.Amount;
import org.zgif.model.datatype.enumeration.ProjectType;
import org.zgif.model.node.entity.AbstractEntityNode;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r Project complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractEntityNode">
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
 *     &lt;/extension>
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
public class Project
    extends AbstractEntityNode
{

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
*/

    /**
*/

}
