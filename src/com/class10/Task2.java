package com.class10;

public class Task2 {

	public static void main(String[] args) {
		
		//Create an array on integers and calculate 
		//the sum of all integer elements in an array.
		
		int[] num= {1,2,3,4,5,6,7,8,9};
		
		// 1 way:
		int sum=num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8];
		System.out.println(sum);
		
		// 2 way:
		int sum1=0;
		for(int i=num[0]; i<=num.length; i++) {
			sum1+=i;
		}
		System.out.println(sum1);
		
		// 3 way:
		int sum2=0;
		for(int j: num) {
			sum2+=j;
		}
			System.out.println(sum2);
		}
	}
