package com.class18;

public class ConstructorDemo {
	
	static String str="Hello";

	ConstructorDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	
	ConstructorDemo(String str){
		System.out.println("I am constructor with 1 String parameter: "+str);
	}
	ConstructorDemo(int num){
		System.out.println("I am constructor with 1 int parameter: "+num);
	}
	ConstructorDemo(String str, int num){
		System.out.println("I am constructor with 1 int parameter: "+str+" & "+num);
	}
	
	public static void main(String[] args) {
		
		System.out.println(str);
		ConstructorDemo obj=new ConstructorDemo();
		ConstructorDemo obj1=new ConstructorDemo("Today is a Java Class");
		ConstructorDemo obj2=new ConstructorDemo(12);
		ConstructorDemo obj3=new ConstructorDemo("Yes", 13);
	}
}