package com.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		
		//create a grocery map (item, quantity) in which we don't need to save the order
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("bread", 2);
		grocery.put("meat", 3);
		grocery.put("cheese", 1);
		grocery.put("fruits", 8);
		System.out.println(grocery);
		
		//create a map of items to buy (item, quantity) in which we want to save the order
		Map<String, Integer> household=new LinkedHashMap<>();
		household.put("Toilet Paper", 12);
		household.put("Hand Soap", 1);
		household.put("Paper Towels", 8);
		household.put("Sanitizer", 2);
		household.put("Lysol", 3);
		System.out.println(household);
		
		Map<String, Integer> shopping=new TreeMap<>(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		//get all keys using advanced for loop
		for(String key:shopping.keySet()) {
			System.out.println("Key: "+key);
		}
		
		//get all keys using iterator
		Iterator<String> it=shopping.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("Key="+it.next());
		}
		
		//get all values using advanced for loop
		for(int val:shopping.values()) {
			System.out.println("Value: "+val);
		}
		
		//get all values using iterator
		Iterator<Integer> key=shopping.values().iterator();
		while(key.hasNext()) {
			System.out.println("Key: "+key.next());
		}
	}
}
