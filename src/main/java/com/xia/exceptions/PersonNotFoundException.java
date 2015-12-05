package com.xia.exceptions;

public class PersonNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String id;
	private String message;

	public PersonNotFoundException(String id, String message) {
		this.id = id;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public String getId() {
		return id;
	}
}