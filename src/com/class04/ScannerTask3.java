package com.class04;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		//Create a Java program that will ask user to input city and temperature. 
		//Your program should convert Fahrenheit into celsius 
		//and print “The temperature is the city __ is __”
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter city");
		String city=scan.nextLine();
		System.out.println("Please enter temperature in Fahrenheits");
		float temp=scan.nextFloat();
		System.out.println("The temperature in the city "+city+" is "+((temp-32)*0.55)+"C");

	}
}
