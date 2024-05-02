package com.exception;

public class InvalidPetAgeException extends Exception {
	
	
	private static final long serialVersionUID = -2089976077167400195L;
	private String message;

	public InvalidPetAgeException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}