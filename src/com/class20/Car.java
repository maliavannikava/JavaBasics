package com.class20;

public class Car {
	
	String make, model;
	
	public Car() {
		System.out.println("I am parent class");
	}
}

class Mercedes extends Car{
	String sportModel;
	public Mercedes() {
		//super();..compiler adds super() by default
		System.out.println("I am a child class constructor");
	}
	
	public Mercedes (String sportModel) {
		this.sportModel=sportModel;
	}
	
	public void display() {
		System.out.println("I have "+make+" "+model+" "+sportModel);
	}
}
