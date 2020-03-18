package com.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		
		int day=2;
		if(day == 2 || day == 3) {
			System.out.println("Today is SDLC class");
		}else if (day==6 || day==7) {
			System.out.println("Today is Java class");
		}else if(day==1 || day==5){
			System.out.println("Today is off");
		}else if(day==4) {
			System.out.println("Today is a Review class");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("__________________");
		
		//To compare String we use equals
		String day1="Saturday";
		if(day1.equals("Tuesday") || day1.contentEquals("Wednesday")) {
			System.out.println("Today is SDLC class");
		}else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java class");
		}
	}
}
