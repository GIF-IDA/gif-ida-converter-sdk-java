package org.zgif.model.node;

import java.util.Locale;

import org.joda.time.LocalDateTime;
import org.zgif.model.annotation.DataField;
import org.zgif.model.annotation.Node;
import org.zgif.model.datatype.enumeration.Process;

@Node(parentNodes={AbstractZGif.class})
public final class Meta extends AbstractNode {
    @DataField(wikiPageName="")
	private String format;
    @DataField(wikiPageName="")
	private String version;
    @DataField(wikiPageName="")
	private Process process;
    @DataField(wikiPageName="")
	private Locale language = Locale.GERMANY;
    @DataField(wikiPageName="")
	private LocalDateTime created;
    @DataField(wikiPageName="")
	private LocalDateTime validated;
    @DataField(wikiPageName="")
	private String publisher;
    @DataField(wikiPageName="")
	private String creator;
    @DataField(wikiPageName="")
	private String validator;
    @DataField(wikiPageName="")
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
