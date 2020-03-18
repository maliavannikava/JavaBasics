package com.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		//declare date and a day
		//if day is Friday --> if date is 13 --> watch a scary movie
		//if day is Friday --> if date is NOT 13 --> watch a comedy
		
		boolean isFriday=true;
		int date=14;
		
		if(isFriday) {
			System.out.println("Today is Friday, I am going to watch a movie");
			if(date==13) {
				System.out.println("I'll watch a scary movie");
			}else {
				System.out.println("I'll watch a drama");
			}
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}
	}
}
