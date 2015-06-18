//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 11:56:39 AM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für fTYPE_ZGIF complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fTYPE_ZGIF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manifest" type="{}fTYPE_MANIFEST"/>
 *         &lt;element name="periods" type="{}fTYPE_PERIODS"/>
 *         &lt;element name="meta" type="{}fTYPE_META"/>
 *         &lt;element name="maindata" type="{}fTYPE_DATA"/>
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
@XmlType(name = "fTYPE_ZGIF", propOrder = {
    "manifest",
    "periods",
    "meta",
    "maindata"
})
public class FTYPEZGIF {

    @XmlElement(required = true)
    protected FTYPEMANIFEST manifest;
    @XmlElement(required = true)
    protected FTYPEPERIODS periods;
    @XmlElement(required = true)
    protected FTYPEMETA meta;
    @XmlElement(required = true)
    protected FTYPEDATA maindata;
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
     *     {@link FTYPEMANIFEST }
     *     
     */
    public FTYPEMANIFEST getManifest() {
        return manifest;
    }

    /**
     * Legt den Wert der manifest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FTYPEMANIFEST }
     *     
     */
    public void setManifest(FTYPEMANIFEST value) {
        this.manifest = value;
    }

    /**
     * Ruft den Wert der periods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FTYPEPERIODS }
     *     
     */
    public FTYPEPERIODS getPeriods() {
        return periods;
    }

    /**
     * Legt den Wert der periods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FTYPEPERIODS }
     *     
     */
    public void setPeriods(FTYPEPERIODS value) {
        this.periods = value;
    }

    /**
     * Ruft den Wert der meta-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FTYPEMETA }
     *     
     */
    public FTYPEMETA getMeta() {
        return meta;
    }

    /**
     * Legt den Wert der meta-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FTYPEMETA }
     *     
     */
    public void setMeta(FTYPEMETA value) {
        this.meta = value;
    }

    /**
     * Ruft den Wert der maindata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FTYPEDATA }
     *     
     */
    public FTYPEDATA getMaindata() {
        return maindata;
    }

    /**
     * Legt den Wert der maindata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FTYPEDATA }
     *     
     */
    public void setMaindata(FTYPEDATA value) {
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
