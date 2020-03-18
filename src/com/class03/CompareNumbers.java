package com.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		
		double numberOne=10;
		double numberTwo=10;
		
		if(numberOne>numberTwo) {
			System.out.println("Number one is larger than number 2");
		}else if(numberOne<numberTwo){
			System.out.println("Number one is smaller than number 2");
		}else {
			System.out.println("Numbers are equal");
		}
		System.out.println("_________________________");
		int day=6;
		if(day==1) {
			System.out.println("It is Monday, no class today");
		}else if(day==2) {
			System.out.println("It is Tuesday, we have SDLC class");
		}else if(day==3) {
			System.out.println("It is Wednesday, we have SDLC class");
		}else if(day==4) {
			System.out.println("It is Thursday, we have Java Review class");
		}else if (day==5) {
			System.out.println("It is Friday, no class today");
		}else if (day==6) {
			System.out.println("It is Saturday, we have Java class");
		}else if(day==7) {
			System.out.println("It is Sunday, we have Java class");
		}else {
			System.out.println("Invalid day");
		}

	}

}
