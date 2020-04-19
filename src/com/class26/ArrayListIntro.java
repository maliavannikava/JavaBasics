package com.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//create array list to store number
		
		ArrayList <Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		
		for(int i=0; i<numbers.size(); i++) {
			Integer num=numbers.get(i);
			
		}
		
		for(int num: numbers) {
			System.out.println(num);
		}
	}
}
