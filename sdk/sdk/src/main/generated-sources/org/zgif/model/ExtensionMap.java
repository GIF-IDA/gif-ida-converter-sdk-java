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


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExtensionMap complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExtensionMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{}ExtensionMapKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subMap" type="{}ExtensionSubMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subList" type="{}ExtensionSubList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionMap", propOrder = {
    "key",
    "subMap",
    "subList"
})
public class ExtensionMap {

    protected List<ExtensionMapKey> key;
    protected List<ExtensionSubMap> subMap;
    protected List<ExtensionSubList> subList;

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionMapKey }
     * 
     * 
     */
    public List<ExtensionMapKey> getKey() {
        if (key == null) {
            key = new ArrayList<ExtensionMapKey>();
        }
        return this.key;
    }

    /**
     * Gets the value of the subMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionSubMap }
     * 
     * 
     */
    public List<ExtensionSubMap> getSubMap() {
        if (subMap == null) {
            subMap = new ArrayList<ExtensionSubMap>();
        }
        return this.subMap;
    }

    /**
     * Gets the value of the subList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionSubList }
     * 
     * 
     */
    public List<ExtensionSubList> getSubList() {
        if (subList == null) {
            subList = new ArrayList<ExtensionSubList>();
        }
        return this.subList;
    }

}
