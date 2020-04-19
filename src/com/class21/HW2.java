package com.class21;

public class HW2 {
	//Create a class named ‘Programming’. While creating an object of the class, 
	//if nothing is passed to it, then the message “I love programming languages” should be printed.
	//If some String is passed to it, then in place of “programming languages” 
	//the value variable should be printed. Example, if we pass “Java”, then “I love Java” 
	//should be printed.
	
	String language;
	HW2(String language){
		this.language=language;
		System.out.println("I love programming languages");
	}
	
	public static void main(String[] args) {
	HW2 obj=new HW2("Java");
	
	}
}
