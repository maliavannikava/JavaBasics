package com.class23;

public class FinalKeyword {
	
	public static String str="Hello";
	public static final String str1="Bye";
	
	public static final String applicationURL="http://syntaxtechs.com";
	
	public static void main(String[] args) {
	
		str="Hi";
		
		//str1="Good Night" --> CE
		//applicationURL="http://google.com"; --> CE
	}
	
	public final void hello() {
		System.out.println("I am a final method");
	}
	
	public final void hello(String name) {
		System.out.println("Hello "+name);
	}
}

class SubClass extends FinalKeyword{
	
	//public final void hello() { --> CE
		
}
