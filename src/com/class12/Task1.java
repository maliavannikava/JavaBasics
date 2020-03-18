package com.class12;

public class Task1 {

	public static void main(String[] args) {
		
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		String str="Margarita";
		
		char reversed;
		for(int i=str.length()-1; i>=0; i--) {
			reversed=str.charAt(i);
			System.out.print(reversed);	
		}
	}
}
