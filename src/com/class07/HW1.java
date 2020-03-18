package com.class07;

public class HW1 {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 100 in 1 line with space
		int num;
		for(num=1; num<=100; num++) {
			System.out.print(num+" ");
		}
		
		System.out.println("");
		
		//Print numbers from 100 to 1
		int num1;
		for (num1=100; num1>=1; num1--) {
			System.out.print(num1+" ");
		}
		
		System.out.println("");
		
		//Print even numbers from 20 to 1 (2 ways)
		int num2;
		for (num2=20; num2>1; num2-=2) {
			System.out.print(num2+" ");
		}
		System.out.println("");
		for (num2=2; num2<=20; num2+=2) {
			System.out.print(num2+" ");
		}
		
		System.out.println("");
		
		//Print odd numbers between 20 and 50 (2 ways)
		int num3;
		for (num3=21; num3<50; num3+=2) {
			System.out.print(num3+" ");
		}
		System.out.println("");
		for (num3=49; num3>20; num3-=2) {
			System.out.print(num3+" ");
		}
	}
}
