package com.class11;

public class StringVerifications {

	public static void main(String[] args) {
		
		String message="Welcome Admin!";
		
		message.contains("Admin");
		
		boolean flag=message.contains("welcome");
		System.out.println(flag);
		
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		

	}

}
