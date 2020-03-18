package com.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		//Write a program to ask user to enter numbers of worked years and annual salary.  
		//If user worked for more or equals to 5 years than useris eligible for the bonus,  
		//otherwise  he  is  not. Once user is eligible and salary is larger than 50000 than bonus = 5000,   
		//otherwise bonus=3000.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many years do you woek in this company?");
		int years=scan.nextInt();
		if(years>=5) {
			System.out.println("What is your annual salary?");
			int salary=scan.nextInt();
			System.out.println("You are eligible for the bonus");
			if (salary>=20000) {
				System.out.println("Your bonus is $5000");
			}else {
				System.out.println("Your bonus is $3000");
			}
		}else {
			System.out.println("Sorry, you are not eligible for the bonus");
		}
	}

}
