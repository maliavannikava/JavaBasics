package com.class19;

public class ThisKeyword {
	
	int a;
	int b;
	
	public ThisKeyword(int a, int b) { //constructor
		this.a=a;
		this.b=b;
	}
	
	ThisKeyword(){
		System.out.println("I am non argument constructor");
	}
	
	public void sum(int a, int b) { //method
		System.out.println("Sum of local variables "+(a+b));
		System.out.println("Sum of instance variables "+(this.a+this.b));
	}

	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(10, 20); //constructor
		obj.sum(100, 200); //method
		
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(20,  40);
	}
}
