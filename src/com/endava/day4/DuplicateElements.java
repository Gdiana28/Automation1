package com.endava.day4;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class DuplicateElements {
	public static void main(String[] args) {
		List<String> listWithDuplicates = new ArrayList<>();
		listWithDuplicates.add("Dog");
		listWithDuplicates.add("Cat");
		listWithDuplicates.add("Dog");
		listWithDuplicates.add("Monkey");
		listWithDuplicates.add("Dog");
		System.out.println("Original List: " + listWithDuplicates);
		Set<String> set = new HashSet<>(listWithDuplicates);
		List<String> listWithoutDuplicates = new ArrayList<>(set);
		System.out.println("List without Duplicates: " + listWithoutDuplicates);
	}

}
