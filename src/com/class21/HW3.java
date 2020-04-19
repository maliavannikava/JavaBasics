package com.class21;

public class HW3 {
	
	//Create 1 class with a static method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	
	static void m1() {
		System.out.println("Method with no parameters");
	}
	
	static void m1(int a) {
		System.out.println("Method with 1 parameter");
	}
	
	static void m1(int a, int b) {
		System.out.println("Method with 2 parameters");
	}

	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
	}
}
