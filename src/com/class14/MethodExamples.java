package com.class14;

public class MethodExamples {
	
	void greet() {
		System.out.println("Hello Margarita");
	}
	void greet1(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		
		MethodExamples obj1=new MethodExamples();
		
		obj1.greet1("Margarita");
		obj1.greet1("Pavlik");
		obj1.greet1("Luna");
		obj1.greet1("Jenny");
	}
}
