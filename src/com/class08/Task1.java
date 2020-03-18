package com.class08;

public class Task1 {

	public static void main(String[] args) {
		
		/* even + odd numbers 1-99
		 * 
		 */
		int evenSum=0;
		int oddSum=0;
		for (int i=1; i<=99; i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddSum=oddSum+i;
			}
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
