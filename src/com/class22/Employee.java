package com.class22;

public class Employee {
	
	double salary;
	
	void getPaid() {
		System.out.println("Employee gets paid "+salary);
	}
	
	void work() {
		System.out.println("Employee works");
	}
}

class FullTimeEmployee extends Employee{
	
}

class PartTimeEmployee extends Employee{
	
}

class Contractor extends Employee{
	double hourlyRate;
	
	void getPaid() {
		System.out.println("Contructor gets paid "+hourlyRate);
	}
}
