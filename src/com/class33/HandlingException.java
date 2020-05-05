package com.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			System.out.println("Caught InterruptedException");
			
		}
		
		System.out.println("Countinue to the next try block");
		
		String fPath="";
		try {
			FileInputStream fis=new FileInputStream(fPath);
		}catch(FileNotFoundException fne) {
			System.out.println("Caught FileNotFoundException Exception");
		}
		System.out.println("Countinue to the next try block");
		
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ae) {
		System.out.println("Caught ArithmeticException Exception");
		}
		System.out.println("End of the program");
	}
	}
