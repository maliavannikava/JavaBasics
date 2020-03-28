package com.class17;

public class Task2 {
	//Create a method that will take a String as a parameter and returns reverse String. 
	//Method should be available to all classes within your projects and accessible by class name.
	
	String m(String a) {
		
		for(int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
		return a;
	}

	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		obj.m("Margarita");
	}
}
