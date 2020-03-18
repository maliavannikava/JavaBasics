package com.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		// 1st way: getting all elements
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println(" -- printing using advanced for loop --");
		
		// 2nd way:
		for (char grade:grades) {
			System.out.print(grade+" ");
		}
		
		System.out.println("Next example");
		
		//create an array of fruits and retrieve all elements
		
		String[] fruits= {"Banana", "Orange", "Apple", "Kiwi", "Mango", "Pineapple"};
		//advanced for loop, enhanced for loop, for each loop
		
		for(String fruit:fruits) {
			System.out.print(fruit+" ");
		}
	}
}
