package com.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		
		HashMap<String, String> hmap=new HashMap<>();
		hmap.put("Name", "John");
		hmap.put("Last name", "Smith");
		hmap.put("Address", "123 Test");
		hmap.put("City", "New York");
		
		//how to check if map has values
		boolean isEmpty=hmap.isEmpty();
		System.out.println("Map is empty "+isEmpty);
		
		//how many elements
		int size=hmap.size();
		System.out.println("Mapsize is "+size);
		
		//can we add morevalues?
		hmap.put("Zip", "12345");
		
		//can we store duplicate values?
		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
	}
}
