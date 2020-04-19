package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraListAndIterator {

	public static void main(String[] args) {
		
		//create an array list of chocolate
		
		ArrayList<String> choco=new ArrayList<>();
		choco.add("white");
		choco.add("dark");
		choco.add("milk");
		
		//create an array list of sweets
		
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		Iterator<String> it=sweets.iterator();
		
		if(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
	}
}
