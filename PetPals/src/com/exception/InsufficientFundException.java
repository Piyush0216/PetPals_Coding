package com.exception;

public class InsufficientFundException extends Exception {

	
	private static final long serialVersionUID = -7830860783970595894L;
	private String message;

	public InsufficientFundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
