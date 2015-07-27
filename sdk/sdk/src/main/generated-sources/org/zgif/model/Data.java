//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Data complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="companies" type="{}Companies"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="properties" type="{}Properties"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="accounts" type="{}Accounts"/>
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
@XmlType(name = "Data", propOrder = {
    "companies",
    "properties",
    "accounts"
})
public class Data {

    protected Companies companies;
    protected Properties properties;
    protected Accounts accounts;

    /**
     * Ruft den Wert der companies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Companies }
     *     
     */
    public Companies getCompanies() {
        return companies;
    }

    /**
     * Legt den Wert der companies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Companies }
     *     
     */
    public void setCompanies(Companies value) {
        this.companies = value;
    }

    /**
     * Ruft den Wert der properties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Legt den Wert der properties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Ruft den Wert der accounts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Accounts }
     *     
     */
    public Accounts getAccounts() {
        return accounts;
    }

    /**
     * Legt den Wert der accounts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounts }
     *     
     */
    public void setAccounts(Accounts value) {
        this.accounts = value;
    }

}
