package com.endava.day2;

public class ColorClass {
	public static void main(String[] args) {
		for (Color clr : Color.values()) { //com.endava.day2.Color.values() este un loop for-each care itereaza fiecare valoare a enum-ului com.endava.day2.Color
			                              //metoda values() - returneaza un array cu toate constantele din Enum
			System.out.println(clr);
		}
	}
}

