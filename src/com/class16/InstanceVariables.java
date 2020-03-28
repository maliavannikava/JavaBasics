package com.class16;

public class InstanceVariables {
	
	String name="John"; //instance variable

	public static void main(String[] args) {
		
		String name="Yunus";
		
		System.out.println(name);
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);

	}

}
