package com.class04;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		//You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less than 200,000 then you would lend the money otherwise you would reject the client.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amount of loan needed");
		long num=scan.nextLong();
		
		if(num<200000) {
			System.out.println("I will lend the money to you");
		}else {
			System.out.println("I'm sorry, but you can't get the loan");
		}
	}
}
