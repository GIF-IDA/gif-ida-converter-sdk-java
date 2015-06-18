//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.18 um 11:56:39 AM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für iTYPE_EXTENSION_MAP complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="iTYPE_EXTENSION_MAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY" type="{}iTYPE_EXTENSION_MAP_KEY" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SUB_MAP" type="{}iTYPE_EXTENSION_SUB_MAP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SUB_LIST" type="{}iTYPE_EXTENSION_SUB_LIST" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iTYPE_EXTENSION_MAP", propOrder = {
    "key",
    "submap",
    "sublist"
})
public class ITYPEEXTENSIONMAP {

    @XmlElement(name = "KEY")
    protected List<ITYPEEXTENSIONMAPKEY> key;
    @XmlElement(name = "SUB_MAP")
    protected List<ITYPEEXTENSIONSUBMAP> submap;
    @XmlElement(name = "SUB_LIST")
    protected List<ITYPEEXTENSIONSUBLIST> sublist;

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
     *    getKEY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITYPEEXTENSIONMAPKEY }
     * 
     * 
     */
    public List<ITYPEEXTENSIONMAPKEY> getKEY() {
        if (key == null) {
            key = new ArrayList<ITYPEEXTENSIONMAPKEY>();
        }
        return this.key;
    }

    /**
     * Gets the value of the submap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUBMAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITYPEEXTENSIONSUBMAP }
     * 
     * 
     */
    public List<ITYPEEXTENSIONSUBMAP> getSUBMAP() {
        if (submap == null) {
            submap = new ArrayList<ITYPEEXTENSIONSUBMAP>();
        }
        return this.submap;
    }

    /**
     * Gets the value of the sublist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sublist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUBLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITYPEEXTENSIONSUBLIST }
     * 
     * 
     */
    public List<ITYPEEXTENSIONSUBLIST> getSUBLIST() {
        if (sublist == null) {
            sublist = new ArrayList<ITYPEEXTENSIONSUBLIST>();
        }
        return this.sublist;
    }

}
