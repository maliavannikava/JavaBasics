package com.class15;

public class CreatingMethods {
	
	//create a method that will accept marks
	//based on marks it will return grade
	//if grade>90 --> A, if 90>grade>80 --> B, if 80>grade>70 --> C
	
	char getGrade(int mark) {
		char grade;
		if(mark>=90) {
			grade='A';
		}else if(mark<90 && mark>=80) {
			grade='B';
		}else if(mark<80 && mark>=70) {
			grade='C';
		}else {
			grade='D';
		}
	return grade;
	}

	public static void main(String[] args) {
		
		CreatingMethods obj=new CreatingMethods();
		char grade=obj.getGrade(95);
		System.out.println(grade);
		
		System.out.println(obj.getGrade(75));
			
	}
}
