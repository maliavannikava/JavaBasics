package com.class18;

public class Task3 {
	//Write a program  that will have 4 different access levels of constructors
	//and create 3 objects of this class: 1 - inside same class;
	//2 - from outside the class; 3 - from different class inside different package
	//and observe result.
	
	public Task3(){
		System.out.println("I am public constructor");
	}
	Task3(int a){
		System.out.println("I am default constructor");
	}
	protected Task3(String b){
		System.out.println("I am protected constructor");
	}
	private Task3(boolean c){
		System.out.println("I am private constructor");
	}
	
	public static void main(String[]args) {
		
		Task3 obj1=new Task3();
		Task3 obj2=new Task3(3);
		Task3 obj3=new Task3("Java");
		Task3 obj4=new Task3(true);
	}
}
