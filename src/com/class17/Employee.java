package com.class17;

public class Employee {
	
	public static String title;
	
	public String name;
	protected String lastName;
	double salary; //default
	private long ssn;
	
	public static void method1() {
		System.out.println("I am public method");
	}
	
	protected void method2() {
		System.out.println("I am protected method");
	}
	
	void method3() {
		System.out.println("I am default method");
	}
	
	private void method4() {
		System.out.println("I am private method");
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name="John";
		emp.lastName="Smith";
		emp.salary=90000;
		emp.ssn=123456789;
		
		method1();
		emp.method2();
		emp.method3();
		
	}
}
