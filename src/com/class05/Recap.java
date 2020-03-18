package com.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		//Create a Java program that will ask if user has acredit card or not. 
		//If you user does not have acredit card then offer them. 
		//If they do have one, ask what is balance on the card? 
		//If balance ofthe card is larger than 1000, tell them to pay off immediately, 
		//otherwise you can tell them that they can spend more.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean card=scan.nextBoolean();
		if(card==true) {
			System.out.println("What is your balance?");
			int balance=scan.nextInt();
			if (balance>=1000) {
				System.out.println("Please pay for your card");
			}else {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("We can offer you a card");
		}
	}
}
