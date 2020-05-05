package com.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.chainsaw.Main;

public class Task2 {
	/*Create a static method that will return a List of Exceptions.
	  Inside your method create objects of 4 exception classes using try and catch blocks 
	  and store them inside your list.
      Call your method inside main and print name and details of all Exception objects.
	 */
	
	
	static List<Exception> m() {
		
		List<Exception> llist=new LinkedList<>();
		
		String fPath="";
		try {
			FileInputStream fis=new FileInputStream(fPath);
		}catch(FileNotFoundException fne) {
			System.out.println("Caught FileNotFoundException Exception");
			llist.add(fne);
		}
		
		
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ae) {
		System.out.println("Caught ArithmeticException Exception");
		llist.add(ae);
		}
		
		
		int[] ar= {1,2,3,4,5,6,7};
		try {
		int character=ar[10];
		System.out.println(character);
		}catch(ArrayIndexOutOfBoundsException se) {
			System.out.println("Caught ArrayIndexOutOfBoundsException");
			llist.add(se);
		}
		
		
		Scanner scan=new Scanner(System.in);
		try {
		int num=scan.nextInt();
		System.out.println(num);
		}catch(InputMismatchException ime) {
			System.out.println("Caught InputMismatchException Exception");
			llist.add(ime);
		}
	
		return llist;
	    }
	public static void main(String[] args) {
		m();
		
	}
}
