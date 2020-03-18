package com.class12;

public class Task4 {

	public static void main(String[] args) {
		
		//Create a String that will hold a sentence. 
		//Write a program to get a new String without any spaces.
		
		String str="I don't have to work tomorrow";
		System.out.println(str);
		System.out.println(str.replaceAll(" ", ""));
	}
}
