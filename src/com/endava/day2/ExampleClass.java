package com.endava.day2;

public class ExampleClass {
 char exampleChar = 'a';
 String exampleString = "Hello World";
 int exampleInt = 1;
 Double exampleDouble = 10.0;
 short exampleShort = 10;
 boolean exampleBoolean = true;
 Boolean exampleBoolean2= false;
 char c = (char) exampleInt;
 static long[] longArray = {1L, 2L, 5L};
 long[] longArray2 = new long[3];

 public static void main(String[] args) {
  System.out.println( longArray[0] + 2 + " Welcome to Java ");
  int number;
  boolean result = isEven( number=101);
  System.out.println();
 }
 public static boolean isEven(int number) {
  int remainder = number % 2;
  return remainder == 0;
 }
}


