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

import org.joda.time.LocalDate;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.node.AbstractNode;

@Node(parentNodes={})
public abstract class AbstractEntityNode extends AbstractNode {
    @DataField(wikiPageName = "", isObjectIdentifier = true)
    private String    objectIdSender;
    @DataField(wikiPageName = "")
    private String    objectIdReceiver;
    @DataField(wikiPageName = "")
    private LocalDate validFrom;
    @DataField(wikiPageName = "")
    private LocalDate validTo;
    @DataField(wikiPageName = "")
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