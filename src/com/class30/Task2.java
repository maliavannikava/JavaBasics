package com.class30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {
		
		//Create a map of Best Buy store. Place item id and item name into it. 
		//Example (7664847 = Printer, 7879885= TV etc )
		//Retrieve all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer, String> bestBuy=new TreeMap<>();
		bestBuy.put(7664847,"Printer");
		bestBuy.put(7879885,"TV");
		bestBuy.put(6783922,"Laptop");
		bestBuy.put(6892245,"Hair dryer");
		bestBuy.put(2489363,"Microwave");
		bestBuy.put(1688433,"Refrigirator");
		bestBuy.put(3578942,"Vacuum Cleaner");
		
		Set<Entry<Integer, String>> store=bestBuy.entrySet();
		for(Entry s:store) {
			System.out.println("The store id of "+s.getValue()+" is "+s.getKey());
		}
		
	}
}
