package com.class21;

public class ProgrammingLanguage {
	
	String name;
	String variable;
	
	public ProgrammingLanguage(String name, String varible){
		this.name=name;
		this.variable=variable;
	}
}

class Java extends ProgrammingLanguage{

	String constructor;
	
	Java(String name, String variable, String constructor){
		super(name, variable);
		this.constructor=constructor;
	}
	
	public void details() {
		System.out.println(name+" can have variables"+variable+" and constructor "+constructor);
	}
}
