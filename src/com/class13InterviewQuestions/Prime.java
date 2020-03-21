package com.class13InterviewQuestions;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		boolean isPrime=true;
		
		if(num>1) {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println("Is given number "+num+" prime? "+isPrime);
	}
}
