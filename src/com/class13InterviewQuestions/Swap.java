package com.class13InterviewQuestions;

public class Swap {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable? 
		//Swap 2 strings without a temporary variable?
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		String str1="I love Java";
		String str2="I hate Java";
		
		str1=str1.concat(str2);//combine two Strings
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
	}
}
