package com.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Margarita"); //comes from collection
		llist.add(0, "Pashka"); //comes from list
		llist.add("Pavel");
		llist.add("Luna");
		
		
		int size=llist.size();
		System.out.println(size);
		
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		for(String l:llist) {
			System.out.println(l);
		}
		
		Iterator<String> it=llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
