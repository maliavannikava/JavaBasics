package com.class21;

public class HW4 {
	
	//Create 1 class with a private method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	
	private void m1() {
		System.out.println("Private method with no parameters");
	}
	
	private void m1(int a) {
		System.out.println("Private method with 1 parameter");
	}
	
	private void m1(int a, int b) {
		System.out.println("Private method with 2 parameters");
	}

	public static void main(String[] args) {
		HW4 obj=new HW4();
		obj.m1();
		obj.m1(10);
		obj.m1(10,20);
	}
}
