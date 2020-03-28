package com.class17;

public class Task3 {
	
	//Create a method that will accept a String as a parameter and return 
	//a new String that consist only of vowels. Method should be available 
	//inside the class where it was declared and executed by calling it is name.
	
	private static String m1(String a) {
		
		String b=a.replaceAll("[^Aa,Ee,Ii,Oo,Uu]", "");
		System.out.println(b);
		return a;
	}

	public static void main(String[] args) {
		m1("Margarita");
	}
}
