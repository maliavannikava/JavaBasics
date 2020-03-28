package com.class15;

import java.util.Scanner;

public class HW {
	//Create a method createEmail(). 
	//Based on provided users name, lastName and email type, 
	//your method should return complete email Address. 
	//Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	
	void createEmail(String name, String lastName, String emailType) {
		String email=(name+lastName+"@"+emailType+".com").toLowerCase();
		System.out.println(email);	
	}
	public static void main(String[] args) {
		HW obj=new HW();
		obj.createEmail("Margarita", "Maliavannikava", "gmail");   
	}
}
