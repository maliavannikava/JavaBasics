package com.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/* if declred number is
		 * between 1-10 --> this number is small
		 * between 11-100 --> this number is big
		 * between 101-1000 --> this number is large
		 */
		
		int num=70;
		if (num>=1 && num<=10) {
			System.out.println("This number is small");
		}else if (num>10 && num<=100) {
			System.out.println("This number is big");
		}else if (num>100 && num<=1000) {
			System.out.println("This number is large");
		}else {
			System.out.println("Number is huge");
		}
	}
}
