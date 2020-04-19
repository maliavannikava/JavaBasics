package com.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		//Create a Set of cities in which you want to make sure that insertion order is maintained. 
		//Using Iterator remove any city that starts with “A”;
		
		Set<String> cities=new LinkedHashSet<>();
		cities.add("New York");
		cities.add("Miami");
		cities.add("Vilnius");
		cities.add("Amsterdam");
		cities.add("Minsk");
		cities.add("Washington DC");
		cities.add("Gdansk");
		cities.add("Alushta");
		
		Iterator<String> c=cities.iterator();
		while(c.hasNext()) {
			String cit=c.next();
			if(cit.startsWith("A")) {
				c.remove();
			}
		}
		for(String city:cities) {
			System.out.println(city);
		}
	}
}
