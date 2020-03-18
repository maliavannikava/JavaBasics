package com.class12;

public class SplitFunction {

	public static void main(String[] args) {
		
		String today="Today is my favorite Java class";
		
		String[] ar=today.split("my");
	
		System.out.println(ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		String today1="Today is my favorite Java class";
		String[] ar2=today1.split("a");
		
		for(String a:ar2) {
			System.out.println(a);
			
		}
	}
}
