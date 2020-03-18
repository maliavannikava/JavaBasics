package com.class10;

public class LargestTask {

	public static void main(String[] args) {
		// find the largest element from an array
		
		int[] num= {200, 30, -1, 900, 56, 787};
		int largest=num[0];
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>largest) {	
			largest=num[i];
		}
		}
		System.out.println(largest);
	}
}
