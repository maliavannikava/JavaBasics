package com.class11;

public class MoreRecap {

	public static void main(String[] args) {
		
		String[][] professions= {
				{"QA Tester", "Developer", "Product Owner", "Scrum Master"},
				{"Math Teacher", "Science Teacher", "ESL Teacher"},
				{"Dentist", "Surgeon"}};
		
		for(String[]occupation: professions) {
			for(String occ:occupation){
				System.out.println(occ);
			}
			}
	}
}
