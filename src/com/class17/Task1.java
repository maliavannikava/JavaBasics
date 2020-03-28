package com.class17;

public class Task1 {
	//Create a method that will accept an array as parameters 
	//and will return a sum of all elements from that array. 
	//Method should be visibly only within same package 
	//and accessible by the creating an instance of the class.
	
	int m1(int[] a) {
		int sum=0;
	for(int i=0; i<a.length; i++) {
		sum+=a[i];
	}
		return sum;
	}

	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		int[] b= {1,2,3,4,5,6,7,8,9};
		System.out.println(obj.m1(b));
	}
}
