package com.class30;

import java.util.*;

public class HW {
	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		Iterator<String> it=countries.iterator();
		while(it.hasNext()){
			String str=it.next();
		  if(str.startsWith("A")){
		    it.remove();
		  }
		}
		System.out.println(countries);
	}
  }
