package org.zgif.model.node.entity;

import org.zgif.model.node.AbstractNode;

import javax.xml.bind.annotation.*;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.08.16 at 03:29:57 PM CEST
//


/**
 * <p>Java class for AbstractEntityNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEntityNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}AbstractNode">
 *       &lt;attribute name="objectIdSender" type="{}iTYPE_STRING" />
 *       &lt;attribute name="objectIdReceiver" type="{}iTYPE_STRING" />
 *       &lt;attribute name="validFrom" type="{}iTYPE_LOCALDATE" />
 *       &lt;attribute name="validTo" type="{}iTYPE_LOCALDATE" />
 *       &lt;attribute name="label" type="{}iTYPE_STRING" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEntityNode")
@XmlSeeAlso({
    Account.class,
    Land.class,
    Project.class,
    Building.class,
    Valuation.class,
    BookEntry.class,
    Property.class,
    Lease.class,
    Company.class,
    Unit.class,
    Term.class,
    Record.class,
    ServiceContract.class
})
public abstract class AbstractEntityNode
    extends AbstractNode
{

    @XmlAttribute(name = "objectIdSender")
    protected String objectIdSender;
    @XmlAttribute(name = "objectIdReceiver")
    protected String objectIdReceiver;
    @XmlAttribute(name = "validFrom")
    protected String validFrom;
    @XmlAttribute(name = "validTo")
    protected String validTo;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Gets the value of the objectIdSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdSender() {
        return objectIdSender;
    }

    /**
     * Sets the value of the objectIdSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdSender(String value) {
        this.objectIdSender = value;
    }

    /**
     * Gets the value of the objectIdReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdReceiver() {
        return objectIdReceiver;
    }

    /**
     * Sets the value of the objectIdReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdReceiver(String value) {
        this.objectIdReceiver = value;
    }

    /**
*/

    /**
*/

    /**
*/

    /**
*/

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
