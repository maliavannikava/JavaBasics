package com.class04;

public class NestedIf3 {

	public static void main(String[] args) {
		// 
		
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		if(allergy) {
			System.out.println("Please answer below");
			if(orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
		}else {
			System.out.println("You are healthy");
		}
	}
}
