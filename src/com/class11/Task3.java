package com.class11;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/* Accept username, password, confirm password from a user and check following requirements:
		Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
		Password should be minimum 8 characters, if less → message=“Password is too short”.
		Password cannot contain username if so, → message=“Password cannot contain username”.
		Password should match confirmed password, if not  → message=“Passwords do not match”.
		Only after all requirements met → message “Your username and password has been created”*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your username");
		String name=scan.nextLine();
		System.out.println("Please enter your password");
		String password1=scan.nextLine();
		System.out.println("Confirm your password");
		String password2=scan.nextLine();
		
		if(name.isEmpty() || password1.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		}else if(password1.length()<8) {
			System.out.println("Password is too short");
		}else if(password1.contains(name)) {
			System.out.println("Password cannot contain username");
		}else if(!password1.equals(password2)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
	}
}
