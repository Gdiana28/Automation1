package com.endava.day4;

public class CustomRuntimeException extends RuntimeException {
	public CustomRuntimeException(String message) {
		super(message);
	}
public CustomRuntimeException(String message, Throwable cause) {
		super(message, cause);
}
}