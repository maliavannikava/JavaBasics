package com.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	String type, name;
	Store(String type, String name){
		this.type=type;
		this.name=name;
	}
	
	public void display() {
		System.out.println("This is "+name);
	}
	public abstract void workingHours();
}

class Nike extends Store{
	public Nike(String type, String name) {
		super(type, name);
	}
	
	public void workingHours() {
		System.out.println(name+" works from 10AM till 6PM");
	}
}

class Costco extends Store{

	Costco(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works from 8AM until 8 PM");
	}	
}

class KeyFood extends Store{

	KeyFood(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works 7:30Am until 10PM");
	}	
}

public class UserDefinedClassesinMap {
	
	public static void main(String[] args) {	
		
		Map<Integer, Store> storeMap=new LinkedHashMap<>();
		storeMap.put(1, new KeyFood("Grocery", "Key Food"));
		storeMap.put(2, new Costco("Wholesale", "Costco"));
		storeMap.put(3, new Nike("Retail", "Nike"));
		
		System.out.println(storeMap);
		
		//1st way
		Collection<Store> col=storeMap.values();
		for(Store c:col) {
			System.out.println();
		}
		
		//2nd way
		Set<Entry<Integer, Store>> storeSet=storeMap.entrySet();
		for(Entry<Integer, Store> str:storeSet) {
			str.getValue().workingHours();
			str.getValue().display();
			
		}
	}
}
