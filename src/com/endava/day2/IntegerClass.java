package com.endava.day2;

public class IntegerClass {
	public static void main(String[] args) {
		Integer myInt=5;
		if(myInt instanceof Number) {
			System.out.println(myInt + " is an instance of Number");
		}
		else {
				System.out.println(myInt + " is not an instance of Number");
			}
		}
	}
