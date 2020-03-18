package com.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double discount;
		double finalPrice;
		
		System.out.println("Is there a sale?");
		String sale=scan.nextLine();
		
		if(sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price of item?");
			double price=scan.nextDouble();
			if (price<20) {
				discount=0.1;
				finalPrice=price*discount;
				System.out.println("After discount "+discount+" the price of the item reduced from "+price+" to "+finalPrice);
			}else if(price>=20 && price<100) {
				discount=0.2;
				finalPrice=price*discount;
				System.out.println("After discount "+discount+" the price of the item reduced from "+price+" to "+finalPrice);
			}else if(price>=100 && price<500) {
				discount=0.3;
				finalPrice=price*discount;
				System.out.println("After discount "+discount+" the price of the item reduced from "+price+" to "+finalPrice);
			}else if(price>=500) {
				discount=0.5;
				finalPrice=price*discount;
				System.out.println("After discount "+discount+" the price of the item reduced from "+price+" to "+finalPrice);
			}
		}else {
			System.out.println("I'm not going shopping");
		}
	}
}
