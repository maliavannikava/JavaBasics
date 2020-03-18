package com.class11;

public class Task2 {

	public static void main(String[] args) {
		
		//Create an array of countries: north america countries, 
		//south america countries, europe countries, asian countries, african countries. 
		//Then print all values from that array using 2 different loops 
		//and calculate how many total countries been stored.
		
		String[][] countries= { {"USA", "Canada", "Mexico"},
								{"Argentina", "Brazil", "Chile"},
								{"France", "Poland", "Germany"},
								{"China", "India", "Thailand"},
								{"Egypt", "Morocco", "Nigeria"}};
		
		int sum=0;
		for(int i=0; i<countries.length; i++) {
			for(int j=0; j<countries[i].length; j++) {
				System.out.print(countries[i][j]+" ");
				sum++;
			}
			
			System.out.println();
			
		}
		System.out.println(sum);

		System.out.println("____________");	
			for(String[] c:countries) {
				for(String cc:c) {
					System.out.print(cc+" ");
				}
				System.out.println();
			}
			
		}
	}
