package com.class05;

import java.util.Scanner;

public class LogicalNot {

	public static void main(String[] args) {
		/* You are salesman
		 * Ask a user how much his sales are
		 * based on the amount of sales we need to calculate commission
		 * if sales are between 1-100 --> commission is 10%
		 * if sales are between 100-200 --> commission is 20%
		 * if sales are between 200-500 --> commission is 30%
		 * if sales are more than 500 --> commission is 50%
		 */
		Scanner scan=new Scanner(System.in);
		double sales;
		double commission;
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble();
		
		if(sales>=1 && sales<=100) {
			commission=sales*0.1;
		}else if(sales>100 && sales<=200) {
			commission=sales*0.2;
		}else if(sales>200 && sales<=500) {
			commission=sales*0.3;
		}else {
			commission=sales*0.5;
		}
		System.out.println("Based on your sales your commission is "+commission);
	}
}
