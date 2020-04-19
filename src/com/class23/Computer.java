package com.class23;

public class Computer {
	
	//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
	//Define common behavior within and some fields in parent class 
	//and override some of the methods in child classes
	//Define some methods specific to child classes
	//Create objects of child classes and store them into array. 
	//Loop through each object and execute available methods.
	
	String model;
	Computer(String model){
		this.model=model;
	}
	void display() {
		System.out.println("I have "+model);
	}
	
	void OS() {
		System.out.println(model+" supports ");
	}

}

class Apple extends Computer{
	
	Apple(String model){
		super(model);
	}
	
	void OS() {
		System.out.println(model+" supports IOS");
	}
	
}
class Lenovo extends Computer{
	Lenovo(String model){
		super(model);
	}
	
	void OS() {
		System.out.println(model+" supports Windows");
	}
	
}
class HP extends Computer{
	HP(String model){
		super(model);
	}
	void OS() {
		System.out.println(model+" supports Windows");
	}
	
}
class Dell extends Computer{
	Dell(String model){
		super(model);
	}
	void OS() {
		System.out.println(model+" supports Windows");
	}
	
}
