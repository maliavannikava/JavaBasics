package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//Write a program that reads a range of integers (start and end point), provided by a user 
		//and then from that range prints the sum of the even and odd integers.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter range of integers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int sumEven=0;
		int sumOdd=0;
		for( int c=a; c<=b; c++) {
			if(c%2==0) {
				sumEven=sumEven+c;
			}else {
				sumOdd=sumOdd+c;
			}
		}
		System.out.println("The total of even numbers from "+a+" to "+b+" is "+sumEven);
		System.out.println("The total of even numbers from "+a+" to "+b+" is "+sumOdd);
	}
}
