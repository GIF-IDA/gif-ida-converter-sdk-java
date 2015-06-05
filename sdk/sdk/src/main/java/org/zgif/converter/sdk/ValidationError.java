package org.zgif.converter.sdk;


/**
 * 
 * @author Martin Fluegge
 * 
 */
public class ValidationError {

	private String message;
	private String objectId;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
}