package com.class08;

public class Continue {

	public static void main(String[] args) {
		
		for(int y=1; y<=10; y++) {
			if(y==2) {
				System.out.println("I am skipping iteration");
				continue;
			}
			System.out.println(y);
		}
		
		System.out.println("____________");
		
		for(int i=1; i<21; i++) {
			if (i==5 || i==6 || i==7) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("____________");
		
		// Write a programm tht print numbers from1 to 100
		// And doesn't print 35-55
		
		for(int a=1; a<=100; a++) {
			if (a>=35 && a<=55) {
				continue;
			}
			System.out.println(a);
		}
	}
}
