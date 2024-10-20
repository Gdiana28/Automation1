package com.endava.day2;

public class ExFour { //compararea referintelor si a continutului
	public static void main(String[] args) { //metoda principala
		String s1 = "exampleString";  //se creeaza un string care este pus in s1
		String s2 = "exampleString";// se creeaza un string care este pus in s2
		String s3 = new String("exampleString"); // creaza un nou string in memorie chiar daca este identic cu s1,s2
		String s4 = new String("exampleString");// este similar cu s3 numai ca are un nou string creat
		System.out.println(s1 == s2); //rezultatul este true pentru ca aman2 stringuri sunt instante literale identice
		System.out.println(s1.equals(s2)); //rezultatul este true pentru ca aman2 stringuri sunt instante literale identice
		System.out.println(s3 == s4); //rezultatul este fals pentru ca sunt 2 noi obiecte create in memorie, chiar daca au acelasi continut
		System.out.println(s3.equals(s4));//rezultatul este true deoarece aici este comparat continutul din s3 si s4 care este acelasi
	}

}
