package com.class15;

public class Methods {
	
	void sayWelcome() {
		for(int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
	}
	
	void sayAnything(String word, int times) {
		for(int i=1; i<=times; i++) {
			System.out.println(word);
		}
	}
	
	//create a method isItRaining
	//that will accept boolean value as a parameter
	//and based on the value it will print message accordingly
	
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Stay home and learn Java");
		}else {
			System.out.println("It's not raining, go for a walk");
			
		}
	}
}
