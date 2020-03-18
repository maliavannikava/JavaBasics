package com.class12;

public class Task5 {

	public static void main(String[] args) {
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String str="Margarita12345!@#$%";
		System.out.println(str);
		String str2=str.replaceAll("[^A-Za-z]", "");
		System.out.println(str.length());
		System.out.println(str2.length());

	}
}
