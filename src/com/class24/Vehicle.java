package com.class24;

public abstract class Vehicle {
	
	String color;
	
	Vehicle(String color){
		this.color=color;
	}
	
	public void drive(){
		System.out.println("Vehicle drive");
	}
	
	public void stop() {
		System.out.println("Vehicle stops");
	}
	
	public abstract void start();
	public abstract void brake();
}

abstract class Car extends Vehicle{

	String carType;
	
	Car(String color, String carType){
		super(color);
		this.carType=carType;
	}
	
	public void brake() {
		System.out.println(carType+" have brakes");
	}
}

class Tesla extends Car{

	String make;
	
	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}

	@Override
	public void start() {
		System.out.println(make+" starts remotely");
	}
}

abstract class Bus extends Vehicle{
	
	String busType;

	Bus(String color, String busType) {
		super(color);
		this.busType=busType;
	}
	public void drive(){
		System.out.println("Bus drive");
	}
	
	public void stop() {
		System.out.println("Bus stops");
	}

	@Override
	public void start() {		
	}

	@Override
	public void brake() {	
	}	
}

class SchoolBus extends Bus{

	SchoolBus(String make, String color) {
		super(make, color);
	}
	public void drive(){
		System.out.println("School bus drive");
	}
	
	public void stop() {
		System.out.println("School bus stops");
	}
	
}
