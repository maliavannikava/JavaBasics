package com.class29;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {

	public static void main(String[] args) {
		
		Map<Integer, String> building=new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Gregorys");
		building.put(4, "Go-Go Fresh");
		building.put(5, "Amazon");
		building.put(6, "Google");
		
		System.out.println(building.size());
		System.out.println(building);
		
		Set<Integer> keys=building.keySet();
		
		//Printing all values using iterator
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			int key=keysIt.next();
			System.out.println(key);
		}
		
		for(int k:keys) {
			System.out.println(k+":"+building.get(k));
		}
		
		//how to get all values using advanced for loop
		Collection<String> values=building.values();//Iterable=collection
		for(String v:values) {
		System.out.println("Value from collection "+v);
		}
		
		//how to get all values using Iterator
		Iterator<String> valuesIt=values.iterator();
		while(valuesIt.hasNext()) {
			System.out.println(valuesIt.next());
		}
	}
}
