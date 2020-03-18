package com.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String school="Syntax";
		String str=new String("HELLO");
		String str1="This is a String 5678%^&*";
		
		//how many characters String has
		System.out.println(school.length());
		
		
		//convert to String to lowercase or uppercase
		
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String newString=str+school;
		System.out.println(newString);
		
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		String str4="         Welcome to Syntax! ";
		str4=str4.trim();
		System.out.println(str4);
		

	}
}
