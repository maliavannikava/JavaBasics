package com.class15;

public class Task4 {
	
	void hello(String country) {
		if(country.equalsIgnoreCase("Russia")) {
			System.out.println("Привет");
		}else if (country.equalsIgnoreCase("USA")) {
			System.out.println("Hello");
		}else if (country.equalsIgnoreCase("France")) {
			System.out.println("Bonjour");
		}else if (country.equalsIgnoreCase("Argentina")) {
			System.out.println("Hola");
		}else if (country.equalsIgnoreCase("Germany")) {
			System.out.println("Hallo");
		}else {
			System.out.println("Please enter valid country");
		}
	}

	public static void main(String[] args) {
		
		Task4 obj=new Task4();
		obj.hello("russia");
	}
}
