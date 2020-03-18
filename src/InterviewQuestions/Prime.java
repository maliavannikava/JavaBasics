package InterviewQuestions;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==0 || num%3==0) {
			System.out.println("The given number is NOT prime");
		}else {
			System.out.println("The given number is prime");
		}
	}
}
