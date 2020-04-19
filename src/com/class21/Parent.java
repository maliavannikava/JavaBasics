package com.class21;

public class Parent {
	
	String name="Farid";
	String lastName="Smith";
	
	void hello() {
		System.out.println("I am a parent class method");
	}
}

class Child extends Parent{
	String name="Margarita";
	public void display() {
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(super.name);
	}
	
	void sayHello() {
		display();
		hello();
	}
}
