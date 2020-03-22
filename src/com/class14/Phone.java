package com.class14;

public class Phone {
	
	//Create a Class “Phone”. Create 3 Objects of it: 
	//iPhone, Android, Nokia with specific  attributes and behaviors.
	
	String model;
	String color;
	int year;
	
	void call() {
		System.out.println("This phone can make a call");
	}
	void text() {
		System.out.println("This phone can text");
	}
	void photo() {
		System.out.println("This phone can make a photo");
	}
	
	

	public static void main(String[] args) {
		
		Phone iPhone=new Phone();
		iPhone.model="iPhone XS";
		iPhone.color="Silver";
		iPhone.year=2018;
		
		iPhone.call();
		iPhone.text();
		iPhone.photo();
		
		Phone Android=new Phone();
		Android.model="Samsung";
		Android.color="Gold";
		Android.year=2015;
		
		Android.call();
		Android.text();
		Android.photo();
		
		Phone Nokia=new Phone();
		Nokia.model="5800";
		Nokia.color="Black";
		Nokia.year=2010;
		
		Nokia.call();
		Nokia.text();
		Nokia.photo();
		
		System.out.println("I have "+iPhone.color+" "+iPhone.model+", that I bought in "+iPhone.year);

	}
}
