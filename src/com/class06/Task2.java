package com.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//Allow user to enter grade and then provide explanation: 
		//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		//At the end your program should print which grade was entered by a user with explanation.
		
		
		Scanner scan=new Scanner(System.in);
		String exp;
		System.out.println("Please enter your grade");
		char grade=scan.next().charAt(0);
		switch (grade) {
		case 'A':
			exp="Excellent";
			break;
		case 'B':
			exp="Good";
			break;
		case 'C':
			exp="Average";
			break;
		case 'D':
			exp="Bad";
			break;
		default:
			exp="Not acceptable";
		}
		System.out.println("You've got "+grade+" - "+exp);
	}
}
