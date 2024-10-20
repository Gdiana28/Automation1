package com.endava.day4;

public class CustomException {
	public void myMethod(int value) {
		if(value < 0) {
			throw new CustomRuntimeException("Value is negative" + value);
		} else {
			System.out.println("Value is " + value);
		}
	}
	public static void main(String[] args) {
		CustomException customException = new CustomException();
		customException.myMethod(10);
		CustomException example = new CustomException();
		example.myMethod(-5);
		example.myMethod(10);
	}

}
