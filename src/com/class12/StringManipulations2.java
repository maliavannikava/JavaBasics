package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		String str="Today is a rainy day";
		
		String partialString=str.substring(6);
		System.out.println(partialString);
		
		//rainy day
		partialString=str.substring(11);
		System.out.println(partialString);
		
		//Today
		partialString=str.substring(0, 5);
		System.out.println(partialString);
		
		//rainy
		partialString=str.substring(11, 16);
		System.out.println(partialString);

	}
}
