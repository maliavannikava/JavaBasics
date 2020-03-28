package com.class15;

import java.util.Scanner;

public class HW2 {
	
	//Write a method to return whether given number is prime or not?
	
	void prime(int num) {
		
		boolean isPrime=true;
		
		if(num>1) {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
				}
			}else {
				isPrime=false;
		}
		System.out.println(isPrime);
	}

	public static void main(String[] args) {
		
		HW2 obj=new HW2();
		obj.prime(12);
	}
}
