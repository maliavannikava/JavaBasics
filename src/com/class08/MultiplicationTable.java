package com.class08;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		/* We want to create multiplication table
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3
		 */
		
		int num=1;
		for(int i=1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+i*num);
		}
	}
}
