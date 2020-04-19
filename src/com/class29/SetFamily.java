package com.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public abstract class SetFamily {
	
	public static void main(String[] args) {
		Set<String> veggies=new HashSet<>();
		//HashSet makes random order
		veggies.add("cucumber");
		veggies.add("potato");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("eggplant");
		veggies.add("zucchini");
		
		System.out.println(veggies);
		
		//LinkedHashSet guarantee insertion order
		Set<String> fruits=new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("pineapple");
		fruits.add("banana");
		System.out.println(fruits);
		
		//tree set stores objects in ascending order
		Set<String> food=new TreeSet<>(veggies);
		food.addAll(fruits);
		System.out.println(food);
	}
}
