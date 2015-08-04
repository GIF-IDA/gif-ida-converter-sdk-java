package org.zgif.model.node;

import org.zgif.model.node.ZGif;
import org.zgif.model.node.Meta;
import org.zgif.model.node.AbstractNode;
import org.zgif.model.node.Period;
import org.zgif.model.node.Data;
import org.zgif.model.node.group.AbstractGroupNode;
import org.zgif.model.node.entity.AbstractEntityNode;
import org.zgif.model.node.Manifest;
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.08.04 um 01:06:08 PM CEST 
//



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractNode")
@XmlSeeAlso({
    Meta.class,
    ZGif.class,
    AbstractGroupNode.class,
    Period.class,
    AbstractEntityNode.class,
    Data.class,
    Manifest.class
})
public abstract class AbstractNode {


}
