package com.class08;

import java.util.Scanner;

public class Task3Asel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String item;
        double price;
        double money;
        double amount=0;
        double change;
        double remainingBalance;
        
        System.out.println("Please enter the item you want to buy");
        item=scan.nextLine();
        System.out.println("What is the price of the "+item);
        price=scan.nextDouble();
        
        do {
        	System.out.println("Please make a payment");
        	money=scan.nextDouble();
        	
        	amount=amount+money;
        	if(money<price) {
        		remainingBalance=price-money;
        	}else if(money>price) {
        		change=money-price;;
        	}else {
        		System.out.println("Thank you");
        	}
        }while(price!=money);
        System.out.println("Thank you for shopping");
}
}

