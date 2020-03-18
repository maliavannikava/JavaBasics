package com.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//Write a program to ask a user to enter item they want to buy and the price of that item. 
		//Every time user enters money accumulate the amount and tell the user how much is left 
		//to pay off the amount. If user give more money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the item you want to buy");
		String item=scan.nextLine();
		System.out.println("Please enter the price of that item");
		int price=scan.nextInt();
		System.out.println("Please enter how much you are paying");
		int money=scan.nextInt();
		int left;
		
		do {
			if(price==money) {
				System.out.println("The amount is even");
			}else if(price<=money) {
				System.out.println("Here is your change of $"+(money-price));
				break;
			}else if(price>money) {
				left=price-money;
				System.out.println("Please pay the rest of $"+left);
				money=scan.nextInt();
				if(left==money) {
				System.out.println("The amount is even");
					break;
				}
			}
		}while (money!=price);
		System.out.println("Thank you for shopping");
}
}
