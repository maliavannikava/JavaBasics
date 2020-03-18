package InterviewQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//Write a java program to reverse String? Reverse a string word by word?
		
		Scanner scan=new Scanner(System.in);
		String a="Margarita loves Java";
		
		for(int b=a.length()-1; b>=0; b--) {
			System.out.print(a.charAt(b));
		}
		String[] c=a.split(" ");
		for(int d=c.length; d>=0; d++) {
			System.out.println(c[d]);
		}
	}
}
