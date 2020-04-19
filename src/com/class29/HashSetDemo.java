package com.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//create a collection that will store only unique objects and we don't care about the order
		
		HashSet<String> breakfast=new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("toast");
		breakfast.add("salmon");
		breakfast.add("avocado");
		breakfast.add("eggs");
		breakfast.add("juice");
		
		//how many elements in the set
		int size=breakfast.size();
		System.out.println(size);
		//oorder is not maintained
		System.out.println(breakfast);
		
		Iterator<String> myIterator=breakfast.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
	}
}
