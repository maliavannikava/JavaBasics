package com.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String.
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
			if(!str.isEmpty() && str.length()%2!=0 && str.length()>=3) {
				int i=str.length()/2;
				System.out.println(str.charAt(i));
			}else {
				System.out.println("Please follow the instructions");
			}
		}
	}
