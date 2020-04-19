package com.class18;

public class Students {
	
	//Write a java program of Class Students that takes students name and 3 subject grades. 
	//Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
	
	String name;
	int algebra;
	int geography;
	int literature;
	void average() {
		int average=(algebra+geography+literature)/3;
		System.out.println("The average Grade of "+name+" is "+average);
	}
	Students(String SName, int SAlgebra, int SGeography, int SLiterature){
		this.name=SName;
		algebra=SAlgebra;
		geography=SGeography;
		literature=SLiterature;	
	}
	
}
