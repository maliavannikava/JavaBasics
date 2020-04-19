package com.class19;

public class Students {
	
	//Write program as a Student class, that has instance variables name and address. 
	//Create a constructor that will initialize those variables. 
	//Print name & address of given  student using displayInfo method.
	
	String name, address;
	
	Students(String nName, String aAddress){
		this.name=nName;
		this.address=aAddress;
	}
	
	void displayInfo() {
		System.out.println("Name is "+name+" and address is "+address);
	}

	public static void main(String[] args) {
		
		Students obj=new Students("Margarita", "Brooklyn, NY");
		obj.displayInfo();
	}
}
