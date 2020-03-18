package com.class11;

public class StringComparison {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2=new String("Hello");
		if(str1.contentEquals(str2)) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}
		System.out.println("_______________");
		
		if(str1==str2) {
			System.out.println("String are equal");
		}else {
			System.out.println("Strings are equal");
		}
		String str3="Hello";
		
		if(str1==str3) {
			System.out.println("Str1 is equal to str3");
		}else {
			System.out.println("Str1 is NOT equal to Str3");
		}
	}
}
