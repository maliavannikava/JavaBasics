package com.class10;

public class Task1 {

	public static void main(String[] args) {
		
		//Create an array of animals and store 6 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		String[] animals= {"Cat", "Dog", "monkey", "raccoon", "possum", "skunk"};
		
		// 1 way
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("______________");
		
		for(String animal:animals) {
			System.out.println(animal);
		}
	}
}
