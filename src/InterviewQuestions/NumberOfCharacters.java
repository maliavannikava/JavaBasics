package InterviewQuestions;

import java.util.Scanner;

public class NumberOfCharacters {

	public static void main(String[] args) {
		//Find out how many alpha characters are present in a String? Find number of words in string?
		
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		
		String b=a.replaceAll("[^A-Za-z]", "");
		System.out.println(b.length());
		String[] c=a.split(" ");
		System.out.println(c.length);
	}
}
