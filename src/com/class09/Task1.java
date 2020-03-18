package com.class09;

public class Task1 {

	public static void main(String[] args) {
		
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("___________");
		
		for(int c=0; c<5; c++) {
			for(int d=0; d<10; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("___________");
		
		for(int e=0; e<5; e++) {
			for(int f=1; f<10; f++) {
				System.out.print(f);
			}
			System.out.println();
		}
		
		System.out.println("___________");
		
		for(int g=0; g<5; g++) {
			for (int h=5; h>0; h--) {
				System.out.print(h);
			}
			System.out.println();
		}
		
		System.out.println("___________");
		
		for(int i=5; i>0; i--) {
			for (int j=1; j<6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("____________");
		
		for(int k=1; k<=4; k++) {
			for(int l=1; l<=k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("____________");
		
		for(int m=1; m<=5; m++) {
			for(int n=1; n<=m; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
