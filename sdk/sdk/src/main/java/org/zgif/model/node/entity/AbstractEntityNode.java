package org.zgif.model.node.entity;

import java.time.LocalDate;

import org.zgif.model.node.AbstractNode;

public abstract class AbstractEntityNode extends AbstractNode {
	private String objectIdSender;
	private String objectIdReceiver;
	private LocalDate validFrom;
	private LocalDate validTo;
	private String label;
	
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
