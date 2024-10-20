package com.endava.day4;
import java.util.Arrays;
import java.util.List;
public class ArrayElementsList {
public static void main(String[] args) {
	Integer[] array = new Integer[10];
	for (int i = 0; i < array.length; i++) {
		array[i] = i+1;
	}
	List<Integer> list = Arrays.asList(array);
	System.out.println(list);
}
}
