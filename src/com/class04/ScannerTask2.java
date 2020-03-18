package com.class04;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		//You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver licence to them, 
		//otherwise you will offer them to get a learners permit.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("You can have  driver license");
		}else {
			System.out.println("Sorry, but you can get only learners permit for now");
		}
	}
}
