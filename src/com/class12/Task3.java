package com.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/* Write a program that reads two people’s first names and if they expecting boy or girl?
		Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Mom's first name");
		String mom=scan.nextLine();
		System.out.println("Dad's first name");
		String dad=scan.nextLine();
		System.out.println("Boy or Girl");
		String baby=scan.nextLine();
		
		String halfMom;
		String halfDad;
		if(baby.equalsIgnoreCase("boy")) {
			if(mom.length()%2==0 || dad.length()%2==0) {
				halfDad=dad.substring(0, dad.length()/2);
				halfMom=mom.substring(mom.length()/2, mom.length());
				System.out.println(halfDad.concat(halfMom));
			}else if (mom.length()%2!=0 || dad.length()%2!=0) {
				halfDad=dad.substring(0, (dad.length()+1)/2);
				halfMom=mom.substring((mom.length()-1)/2, mom.length());
				System.out.println(halfDad.concat(halfMom));
			}
		}else if(baby.equalsIgnoreCase("girl")){
			if(mom.length()%2==0 || dad.length()%2==0) {
				halfMom=mom.substring(0, mom.length()/2);
				halfDad=dad.substring(dad.length()/2, dad.length());
				System.out.println(halfMom.concat(halfDad));
			}else if (dad.length()%2!=0 || mom.length()%2!=0) {
				halfMom=mom.substring(0, (mom.length()+1)/2);
				halfDad=dad.substring((dad.length()-1)/2, dad.length());
				System.out.println(halfMom.concat(halfDad));
			}	
		}
	}
}
