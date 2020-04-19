package com.class19;

public class AnimalsTest {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.breed="Husky";
		dog.color="Grey";
		dog.fur="Long";
		dog.size="Big";
		
		dog.bark();
		dog.move();
		dog.eat();
		dog.sleep();
		
		
		Cat cat=new Cat();
		cat.breed="Russian blue";
		cat.bigEyes=true;
		cat.color="Grey";
		cat.fur="Short";
		cat.size="Small";
		cat.meow();
		
		Animals animal=new Animals();
		animal.color="Any";
		animal.size="Any";
		animal.fur="Any";
		

	}
}
