package com.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.add("John");
		arrayList.add("Marga");
		
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		
		arrayList.add("Jane");
		arrayList.add("Pasha");
		
		int size=arrayList.size();
		System.out.println(size);
		
		arrayList.add("Hercules");
		System.out.println(arrayList.size());
		
		arrayList.remove("John");
		System.out.println(arrayList.size());
		
		arrayList.add("Zhuk");
		System.out.println(arrayList);
		
		arrayList.set(1, "Tarakan");
		System.out.println(arrayList);
		
		for(int i=0; i<arrayList.size(); i++) {
			String element=arrayList.get(i);
			System.out.print(element+" ");
		}
	}
}
