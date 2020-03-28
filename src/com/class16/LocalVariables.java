package com.class16;

public class LocalVariables {
	
	void nameInside() {
		String name="John";	
		}

	public static void main(String[] args) {
		
		//System.out.println(name);  --> error
		
		LocalVariables obj=new LocalVariables();
		obj.nameInside();
		
		boolean flag=true;
		
		if(flag) {
			String answer="Yes";
		}
		
		//System.out.println(answer); --> error

	}
}
