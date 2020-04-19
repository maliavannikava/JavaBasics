package com.class25;

public interface Drivable {
	
	//public static final --> by default
	boolean MOVE_FAST=true;
	
	//public abstract  --> by default
	void drive();
}

abstract class Vehicles{
	abstract void stop();
}

class Cars extends Vehicles implements Drivable{
	
	public void drive() {
		System.out.println("Car drives");
	}

	@Override
	void stop() {
		System.out.println("Car stops");
	}
}
