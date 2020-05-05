package com.class34;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		NullPointerException npe=new NullPointerException();
		
		//throw npe;
		
		throwException();

	}
	
	//create a method for balance and amount
	public static void withdraw(int balance, int amount) {
		if(amount>balance) {
			throw new RuntimeException("Your balance is too low");
		}
	}
	
	public static void throwException() {
		throw new ArithmeticException();
	}
	
	public static void browser(String browser) {
		switch(browser) {
		case "chrome":
			System.out.println("Using chrome browser");
			break;
		case "firefox":
			System.out.println("Using firefox browser");
			break;
		default:
			throw new RuntimeException("Invalid browser");
		}
	}
}
