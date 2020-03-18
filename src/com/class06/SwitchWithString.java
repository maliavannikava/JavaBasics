package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/* Ask a user where he or she from
		 * based on the country we will define favorite food
		 * Your favorite food is____
		 */
		
		Scanner scan=new Scanner(System.in);
		String food;
		
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		
		switch(country) {
		case "Morocco":
			food="couscous";
			break;
		case "Belarus":
			food="Draniki";
			break;
		case "Tajikistan":
			food="Osh";
		break;
		case "Turkey":
			food="Baklava";
			break;
		case "Afghanistan":
			food="Mantu";
			break;
		case "Kazakhstan":
			food="Beshbarmak";
			break;
		default:
				food="Unknown";	
}
}
}
