package com.class33;

public class ExceptionIntro {
	
	static String str;

	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		
		//System.out.println(a/b); --> arithmeticaException
		
		System.out.println(a/b);
		
		System.out.println("End of the program");
		
		int[] arrays= {12,1,13};
		
		//System.out.println(array[3]); --> ArrayIndexOutOfBoundsException
		
		//System.out.println(str.length()); --> NullPointerException
		
		NullPointerException npe=new NullPointerException();
		throw(npe);	
	}
}
