package com.class34;

public class Task1 {
	//Create a method to check age eligibility that will throw a runtime exception. 
	//Method should throw an exception age is less than 16.
	
	public static void eligibility(int age) {
		if(age>16) {
			System.out.println("Congrats! You are eligible for credit card");
		}else {
			throw new RuntimeException("I'm sorry, but you need to wait until you are 16 yo");
		}
	}

	public static void main(String[] args) {

		eligibility(10);
	}
}
