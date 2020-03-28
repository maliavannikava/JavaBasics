package com.class16;

public class Dog {
	String name, size;
	int age;
	
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	void displayDog() {
		System.out.println("Dog name is "+name+". It's a "+size+" dog and it's "+age+" years old");
		System.out.println(breed+" has "+paws+" paws and "+tail+" tail");
	}

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.name="Lucy";
		dog1.size="big";
		dog1.age=5;
		dog1.age=6;
		dog1.displayDog();
		
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		System.out.println(dog1.breed);
		
		Dog dog2=new Dog();
		dog2.name="Sharik";
		dog2.size="small";
		dog2.age=2;
		dog2.displayDog();
		
	
	}
}
