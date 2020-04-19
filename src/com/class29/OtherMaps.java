package com.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		
		//store students id and corresponding name
		Map<Integer, String> lmap=new LinkedHashMap<>();
		lmap.put(1000, "Margarita");
		lmap.put(1001, "Pavlik");
		lmap.put(1002, "Luna");
		System.out.println(lmap);
		
		
		Map<Integer, String> tmap=new TreeMap<>();
		tmap.put(1000, "Margarita");
		tmap.put(1001, "Pavlik");
		tmap.put(1002, "Luna");
		System.out.println(tmap);
		
		Map<String, Integer> population=new TreeMap<>();
		population.put("USA", 330000000);
		population.put("Belarus", 9500000);
		population.put("India", 1326000000);
		population.put("Russia", 144500000);
		System.out.println(population);
	}
}
