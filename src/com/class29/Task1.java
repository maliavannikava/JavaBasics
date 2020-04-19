package com.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		//Create a Set collection in which you need to add names of the countries. 
		//In this set we want all objects to be sorted in alphabetical order. 
		//Using 2 different ways retrieve all elements from set.
		
		Set<String> countries=new TreeSet<>();
		countries.add("USA");
		countries.add("Belarus");
		countries.add("Argetina");
		countries.add("New Zeland");
		countries.add("Poland");
		
		for(String c:countries) {
			System.out.println(c);
		}
		
		Iterator<String> con=countries.iterator();
		while(con.hasNext()) {
			System.out.println(con.next());
		}

	}

}
