package com.class08;

import java.util.Scanner;

public class LoopRecap {

	public static void main(String[] args) {
		
		/* Ask a user to pay for candy
		 * As long as the entered price is not 2
		 * we need to keep ask to pay
		 * Once amount is correct -- > "Enjoy your candy"
		 */
		
		Scanner scan=new Scanner(System.in);
		double price;
		
		do {
		System.out.println("Please pay for a candy");
		price=scan.nextDouble();
		} while(price!=2);
		System.out.println("Thank you");
	}
}
