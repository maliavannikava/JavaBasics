package com.class15;

public class Task2 {
	
	void num(int a) {
		if(a%2==0) {
			System.out.println(a+" is even number");
		}else {
			System.out.println(a+" is odd number");
		}
	}

	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		obj.num(13);	
	}
}
