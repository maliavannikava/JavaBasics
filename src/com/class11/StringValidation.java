package com.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		String str1="Welcome Syntax students";
		String str2="Welcome Syntax Students";
		
		System.out.println("equals()");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies";
		String actual=" Home - Syntax Technologies ";
		
		if(actual.equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fail. Titles are not matched");
		}
		
		if(actual.trim().equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fail. Titles are not matched");
		}
		
	}
}
