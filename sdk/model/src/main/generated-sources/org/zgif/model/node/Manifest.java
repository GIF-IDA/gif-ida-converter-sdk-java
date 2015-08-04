package org.zgif.model.node;

import org.zgif.model.node.AbstractNode;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Manifest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Manifest">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractNode">
 *       &lt;sequence>
 *         &lt;element name="file-entry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="path" use="required" type="{}iTYPE_URI" />
 *                 &lt;attribute name="mimetype" use="required" type="{}iTYPE_STRING" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manifest", propOrder = {
    "fileEntry"
})
public class Manifest
    extends AbstractNode
{

    @XmlElement(name = "file-entry")
    protected List<Manifest.FileEntry> fileEntry;

    /**
     * Gets the value of the fileEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Manifest.FileEntry }
     * 
     * 
     */
    public List<Manifest.FileEntry> getFileEntry() {
        if (fileEntry == null) {
            fileEntry = new ArrayList<Manifest.FileEntry>();
        }
        return this.fileEntry;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="path" use="required" type="{}iTYPE_URI" />
     *       &lt;attribute name="mimetype" use="required" type="{}iTYPE_STRING" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FileEntry {

        @XmlAttribute(name = "path", required = true)
        protected String path;
        @XmlAttribute(name = "mimetype", required = true)
        protected String mimetype;

        /**
         * Ruft den Wert der path-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPath() {
            return path;
        }

        /**
         * Legt den Wert der path-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPath(String value) {
            this.path = value;
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

    }

}
