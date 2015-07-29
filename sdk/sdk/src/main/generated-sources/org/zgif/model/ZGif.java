//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.07.27 um 11:43:51 AM CEST 
//


package org.zgif.model;

import org.zgif.model.*;
import org.zgif.model.types.*;
import org.zgif.model.*;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ZGif complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ZGif">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manifest" type="{}Manifest"/>
 *         &lt;element name="periods" type="{}Periods"/>
 *         &lt;element name="meta" type="{}Meta"/>
 *         &lt;element name="maindata" type="{}Data"/>
 *       &lt;/sequence>
 *       &lt;attribute name="filePath" type="{}iTYPE_STRING" />
 *       &lt;attribute name="mimetype" type="{}iTYPE_STRING" />
 *       &lt;attribute name="type" type="{}iTYPE_STRING" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZGif", propOrder = {
    "manifest",
    "periods",
    "meta",
    "maindata"
})
public class ZGif {

    @XmlElement(required = true)
    protected Manifest manifest;
    @XmlElement(required = true)
    protected Periods periods;
    @XmlElement(required = true)
    protected Meta meta;
    @XmlElement(required = true)
    protected Data maindata;
    @XmlAttribute(name = "filePath")
    protected String filePath;
    @XmlAttribute(name = "mimetype")
    protected String mimetype;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Ruft den Wert der manifest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Manifest }
     *     
     */
    public Manifest getManifest() {
        return manifest;
    }

    /**
     * Legt den Wert der manifest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Manifest }
     *     
     */
    public void setManifest(Manifest value) {
        this.manifest = value;
    }

    /**
     * Ruft den Wert der periods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Periods }
     *     
     */
    public Periods getPeriods() {
        return periods;
    }

    /**
     * Legt den Wert der periods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Periods }
     *     
     */
    public void setPeriods(Periods value) {
        this.periods = value;
    }

    /**
     * Ruft den Wert der meta-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Legt den Wert der meta-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

    /**
     * Ruft den Wert der maindata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getMaindata() {
        return maindata;
    }

    /**
     * Legt den Wert der maindata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setMaindata(Data value) {
        this.maindata = value;
    }

    /**
     * Ruft den Wert der filePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Legt den Wert der filePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Ruft den Wert der mimetype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Legt den Wert der mimetype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
