package com.class15;

public class Task3 {
	
	void palindrome(String str) {
		
		char[] charArray = str.toCharArray();
		String reverse="";
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse += charArray[i];
		}
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println(str+" is palindrome word");
		}else {
			System.out.println(str+" is not palindrome word");
		}
	}

	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.palindrome("kayak");
	}
}
