package com.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		
		//create a map that will store month and days in a month
		Map<String, Integer> month=new LinkedHashMap<>();
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size());
		
		Set<Entry<String, Integer>> entries=month.entrySet();
		
		//loop through all entry objects
		for(Entry e:entries) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		//iterate through all entry objects
		Iterator<Entry<String, Integer>> it=entries.iterator();
		while(it.hasNext()) {
			//System.out.println("Key is "+it.next().getKey()+" and the value is "+it.next().getValue()); --> random order
			Entry<String, Integer> entry=it.next();
			System.out.println(entry.getKey()+" has "+entry.getValue()+" days");
		}
	}
}
