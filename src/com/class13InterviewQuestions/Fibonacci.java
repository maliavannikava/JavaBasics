package com.class13InterviewQuestions;

public class Fibonacci {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int n1=0;
		int n2=1;
		
		for(int a=1; a<=10; ++a) {
			System.out.print(n1+" ");
			int sum=n1+n2;
			n1=n2;
			n2=sum;		
		}
	}
}
