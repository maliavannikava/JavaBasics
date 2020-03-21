package com.class14;

public class Dog {
	
	String breed;
	String color;
	String name;
	int age;

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="Shiba Inu";
		dog1.color="Red and white";
		dog1.name="Peach";
		dog1.age=2;
		
		Dog dog2=new Dog();
		dog2.breed="Chow Chow";
		dog2.color="Red";
		dog2.name="Teddy";
		dog2.age=10;
		
		System.out.println("I have "+dog1.color+" "+dog1.breed+" dog. His name is "+dog1.name+". He is "+dog1.age+" years old.");
		
	}
}
