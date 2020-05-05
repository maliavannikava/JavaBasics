package com.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		//Create a map of countries with its capital that will store countries in alphabetical order.
		//Print all keys and values from a country map using for each loop and iterator.
		//Print all values from a country map using for each loop and iterator.
		
		Map<String, String> countries=new TreeMap<>();
		countries.put("USA", "Washington DC");
		countries.put("Belarus", "Minsk");
		countries.put("Germany", "Berlin");
		countries.put("Canada", "Ottawa");
		countries.put("Spain", "Madrid");
		countries.put("Italy", "Rome");
		
		for(String key:countries.keySet()) {
			System.out.println("The country is "+key);
		}
		Iterator<String> keyIt=countries.keySet().iterator();
		while(keyIt.hasNext()) {
			System.out.println("The key is "+keyIt.next());
		}
		
		for(String value:countries.values()) {
			System.out.println("The capital is "+value);
		}
		Iterator<String> valueIt=countries.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println("The value is "+valueIt.next());
		}
	}
}
