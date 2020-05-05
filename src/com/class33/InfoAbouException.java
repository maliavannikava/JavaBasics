package com.class33;

public class InfoAbouException {

	public static void main(String[] args) {
		
		String str="Hello";
		
		try {
		
		char character=str.charAt(10);
		
		System.out.println(character);
		}catch(StringIndexOutOfBoundsException se) {
			//to get info about Exception
			se.printStackTrace(); //name, message about E, location of E
			System.out.println(se);
		}
	}
}
