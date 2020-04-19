package com.class20;

public class Employee {
	
	public static String company;
	static void work() {
		System.out.println("This employee works in "+company);
	}
	protected int empNumber;
	double salary;
	private long ssn;
	void getPaid() {
		System.out.println("This employee earns "+salary+" a year");
	}

}
