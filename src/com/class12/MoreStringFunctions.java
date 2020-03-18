package com.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		
		String me="I am a good tester";
		
		String newString=me.replace("a", "c");
		System.out.println(newString);
		
		me=me.replace("good", "great");
		System.out.println(me);
		
		String str="Phone number is 1234567890#$%^&";
		String str1="DFGHUJ#$%^&*345678";
		System.out.println(str);
		str=str.replaceAll("[A-Za-z]", "");
		System.out.println(str);
		str1=str1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str1);
		
		String j="Java";
		j=j.replace("a", "e").replace("J", "I").toUpperCase();
		System.out.println(j);
		

	}
}
