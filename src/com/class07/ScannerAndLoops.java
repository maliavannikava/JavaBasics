package com.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String name;
		int num=1;
		
		while(num<=5) {
		System.out.println("What is your name?");
		name=scan.nextLine();
		
		System.out.println("Good agternoon "+name);
		num++;
		}
	}
}
