package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
		
		Scanner scan=new Scanner(System.in);
		String language;
		
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		
		switch(country) {
		case "USA":
			language="English";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Germany":
			language="German";
		break;
		case "Turkey":
			language="Turkish";
			break;
		case "France":
			language="French";
			break;
		case "China":
			language="Chinese";
			break;
		case "Argentina":
			language="Spanish";
			break;
		case "Brazil":
			language="Portugese";
			break;
		default:
				language="Unknown";	
}
		System.out.println(language);
}
}
