package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		
		//lets create array list that stores double type of objects
		//generic array List
		ArrayList<Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		
		System.out.println(alist.size());
		alist.set(1, 13.90);
		
		
		for(double a:alist) {
			System.out.println(a);
		}
		
		Iterator<Double> iterator=alist.iterator();
		while(iterator.hasNext()) {
			double d=iterator.next();
			System.out.println(d);
		}
		
		ArrayList obj=new ArrayList();
		obj.add("hello");
		obj.add(100);
		obj.add('c');
		obj.addAll(alist);
	}
}
