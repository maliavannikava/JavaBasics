package com.class19;

public class ConstructorCall {
	
	public ConstructorCall() {
		System.out.println("I am non argument constructor");
	}
	
	public ConstructorCall(String str) {
		this();
	}
	public ConstructorCall(String str1, String str2) {
		this("Hello");
	}

	public static void main(String[] args) {
		ConstructorCall obj=new ConstructorCall("Java","Love");
	}
}
