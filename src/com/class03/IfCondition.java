package com.class03;

public class IfCondition {

	public static void main(String[] args) {
		
		System.out.println("Starting coding");
		
		int num=78;
		
		if(num>100) {
			System.out.println("My number is large");
		}
		System.out.println("End of the program");
		
		System.out.println("___________________");
		
		int expectedHours=15;
		int actualHours=4;
		//if actual is more than expected --> you will love java
		
		if(actualHours>=expectedHours) {
			System.out.println("You will love Java");
		}else {
			System.out.println("You will hate Java");
		}
		
		System.out.println("_______________");
		
		double budget=10000;
		double price=12000;
		
		if(budget>=price) {
			System.out.println("I'll buy a car");
		}else {
			System.out.println("I'll buy a bicycle");
		}
		System.out.println("I am code after if condition");
	}
}
