package com.class15;

import java.util.Scanner;

public class CalculatorScanner {
	
	//define methods to calculate add, sub, div, mult
	
	Scanner scan=new Scanner(System.in);
	
		int a=scan.nextInt();
		int b=scan.nextInt();
	
	void add() {
		System.out.println(a+b);
	}
	
	void sub() {
		System.out.println(a-b);
	}
	
	void mult() {
		System.out.println(a*b);
	}
	
	void div() {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		
		CalculatorScanner obj=new CalculatorScanner();
		obj.add();
		
	}
}
