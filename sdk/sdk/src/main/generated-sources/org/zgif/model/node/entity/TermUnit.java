package org.zgif.model.node.entity;
import org.zgif.model.node.entity.Terms;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TermUnit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TermUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terms" type="{}Terms" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hash" type="{}iTYPE_STRING" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermUnit", propOrder = {
    "terms"
})
public class TermUnit extends AbstractEntityNode {

    protected Terms terms;
    @XmlAttribute(name = "hash")
    protected String hash;

    /**
     * Ruft den Wert der terms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Terms }
     *     
     */
    public Terms getTerms() {
        return terms;
    }

    /**
     * Legt den Wert der terms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Terms }
     *     
     */
    public void setTerms(Terms value) {
        this.terms = value;
    }

    /**
     * Ruft den Wert der hash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Legt den Wert der hash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

}
