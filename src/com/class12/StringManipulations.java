package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str="Good Morning Students!";
		
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		char letter5=str.charAt(4);
		System.out.println("Symbol at the index 4 is"+letter5+".");
		
		char letters;
		for(int i=0; i<str.length(); i++) {
			letters=str.charAt(i);
			System.out.println(letters);
		}
		
		String name="Syntax Technologoes";
		
		int index=name.indexOf("y");
		System.out.println(index);
		
		index=name.indexOf("syntax");
		System.out.println("Index of the whole word is the index of the first charcter of this word = "+index);
		
		index=name.indexOf("!"); //--> returns -1 because this symbol doesn't exist in the String
		System.out.println("Index of non existing character = "+index);
		
		index=name.indexOf("o");
		System.out.println("The index of the first o is "+index);
		
		index=name.lastIndexOf("o");
		System.out.println("The index of the last o is "+index);
		
		
		
	}
}
