package org.zgif.model.node;

import java.util.Locale;

import org.joda.time.LocalDateTime;

public final class Meta extends AbstractNode {
	private String format;
	private String version;
	private Process process;
	private Locale language = Locale.GERMANY;
	private LocalDateTime created;
	private LocalDateTime validated;
	private String publisher;
	private String creator;
	private String validator;
	private String description;

	public Meta() {
		super();
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public Locale getLanguage() {
		return language;
	}

	public void setLanguage(Locale language) {
		this.language = language;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getValidated() {
		return validated;
	}

	public void setValidated(LocalDateTime validated) {
		this.validated = validated;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getValidator() {
		return validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
