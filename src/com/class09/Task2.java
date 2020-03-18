package com.class09;

public class Task2 {

	public static void main(String[] args) {
		/* Print the following pattern:
		55555
		4444
		333
		22
		1
		*/
		
		for(int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}

