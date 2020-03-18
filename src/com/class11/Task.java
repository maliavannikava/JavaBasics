package com.class11;

public class Task {

	public static void main(String[] args) {
		
		//Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops.
		
		String[] cars= {"american", "german", "korean", "italian"};
		
		for(String c:cars) {
			System.out.print(c+", ");
		}
		System.out.println();
		
		System.out.println("__________________");
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+", ");
		}
		System.out.println();
	}
}
