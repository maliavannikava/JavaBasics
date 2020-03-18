package com.class07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int number=1;
		int luckyNumber=17;
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			number=scan.nextInt();
		}while (number!=luckyNumber);
		
		System.out.println("Congrats!!!");
	}
}
