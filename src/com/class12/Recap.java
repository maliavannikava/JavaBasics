package com.class12;

public class Recap {

	public static void main(String[] args) {
		
		String str=""; //empty value
		System.out.println(str.isEmpty());
		
		String str1=null; //no value at all
		//System.out.println(str1.isEmpty());  --> nullPointerException
		
		String str2=" Good Morning ";
		String str3="students";
		String str4="!";
		
		str2=str2.concat(str3).concat(str4);

	}
}
