package com.class23;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am ");
	}
	public void sleep() {
		System.out.println("Animal sleep");
	}
}

class Bird extends Animal{
	public static void whoAmI() {
		System.out.println("I am a bird");
	}
	public void sleep() {
		System.out.println("Bird sleep");
	}
}
