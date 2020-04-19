package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	
	//create an array List of cars and retrieve all the values using 3 different ways.
	

	public static void main(String[] args) {
		
		ArrayList<String> car=new ArrayList<>();
		car.add("Honda");
		car.add("Renault");
		car.add("Mercedes");
		car.add("Toyota");
		car.add("Ford");
		
		for(String c:car) {
			System.out.println(c);
		}
		
		for(int i=0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}
		
		Iterator<String> iterator= car.iterator();
		while(iterator.hasNext()) {
			String cars=iterator.next();
			System.out.println(cars);
		}
		
		System.out.println("------------Task 2----------");
		//Create an array List of words. Remove every word that ends with "e". Use iterator
		
		ArrayList<String> words=new ArrayList<>();
		words.add("Hope");
		words.add("Cat");
		words.add("TV");
		words.add("Love");
		words.add("Pillow");
		words.add("Cake");	
		
		for(int j=0; j<words.size(); j++) {
			if(!words.get(j).endsWith("e")) {
				words.remove(words);
				System.out.println(words.get(j));
			}	
		}	
		}
	}
