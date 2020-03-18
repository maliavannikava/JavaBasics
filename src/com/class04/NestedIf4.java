package com.class04;

public class NestedIf4 {

	public static void main(String[] args) {
		boolean quizComplited=true;
		int score=86;
		
		if(quizComplited) {
			System.out.println("Lets check your score");
			
			if(score>90) {
				System.out.println("Great job, you studied a lot");
			}else if(score>80) {
				System.out.println("Well done");
			}else if(score>70) {
				System.out.println("You could have done better");
			}else {
				System.out.println("Please study harder");
			}
		}else {
			System.out.println("Please complete the quiz");
		}
	}
}
