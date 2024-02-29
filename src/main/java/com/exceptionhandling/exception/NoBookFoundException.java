package com.exceptionhandling.exception;

public class NoBookFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoBookFoundException() {
		super("No Such Book Available..");
	}

	public NoBookFoundException(String msg) {
		super(msg);
	}

}
