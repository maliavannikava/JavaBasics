package com.class06;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		//Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		
		
		Scanner scan=new Scanner(System.in);
		int result=0;
		System.out.println("Please enter first number");
		int num1=scan.nextInt();
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		System.out.println("Please enter operator: +, -, *, /");
		char operator=scan.next().charAt(0);
		
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
				System.out.println("Please enter valid operator");
		}
		System.out.println("Arithmetical operation of "+num1+" and "+num2+" is "+result);
}
}
