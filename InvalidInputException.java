package com.te.javabasics;

public class InvalidInputException extends RuntimeException {
	String message;

	public InvalidInputException(String message) {
		this.message = message;

	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
}