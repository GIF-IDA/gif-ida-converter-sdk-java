/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
package org.zgif.model.node.entity;

import javax.xml.bind.annotation.XmlAttribute;

import org.joda.time.LocalDate;
import org.zgif.model.annotation.ObjectIdentifier;
import org.zgif.model.node.AbstractNode;

public abstract class AbstractEntityNode extends AbstractNode {
    @ObjectIdentifier
    @XmlAttribute
    private String    objectIdSender;
    @XmlAttribute
    private String    objectIdReceiver;
    @XmlAttribute
    private LocalDate validFrom;
    @XmlAttribute
    private LocalDate validTo;
    @XmlAttribute
    private String    label;

    public String getObjectIdSender() {
        return objectIdSender;
    }

    public void setObjectIdSender(String objectIdSender) {
        this.objectIdSender = objectIdSender;
    }

    public String getObjectIdReceiver() {
        return objectIdReceiver;
    }

    public void setObjectIdReceiver(String objectIdReceiver) {
        this.objectIdReceiver = objectIdReceiver;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}