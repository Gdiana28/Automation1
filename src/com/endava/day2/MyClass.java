package com.endava.day2;

public class MyClass implements HomeworkInterface{

	@Override
	public void myMethod() {
		System.out.println("My Homework is");
	}
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.myMethod();
	}
}
