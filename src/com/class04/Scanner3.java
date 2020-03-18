package com.class04;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		/*Capture 2 numbers from a user
		 * Compare number and identify which is larger
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		
		int num1=scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}else if(num1==num2){
			System.out.println("numbers are equal");
		}else {
		System.out.println(num2+" is bigger than "+num1);
		
		}
	}
}
