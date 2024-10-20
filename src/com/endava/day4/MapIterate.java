package com.endava.day4;
import java.util.HashMap;
import java.util.Map;
public class MapIterate {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Dog", 1);
		map.put("Cat", 2);
		map.put("Monkey", 3);
		map.put("Elephant", 4);
		map.put("Lion", 5);
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}
