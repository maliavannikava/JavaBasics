package com.class11;

public class Recap {

	public static void main(String[] args) {
		
		String[][] groceries= { {"cucumber", "potato", "carrot"},
								{"mango", "apple", "banana", "kiwi"},
								{"milk", "cheese", "yogurt"}};
		
		System.out.println(groceries[1][2]);
		
		for(int i=0; i<groceries.length; i++) {
			for(int j=0; j<groceries[i].length; j++) {
				System.out.print(groceries[i][j]+" ");
			}
			System.out.println();
		}
		for(String[] gro: groceries) {
			for(String array:gro) {
			System.out.println(array);
		}
	}
}
}
