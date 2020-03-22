package com.class15;

public class Task1 {
	
	void large(int a, int b) {
		if(a>b) {
			System.out.println(a+" is larger");
		}else if (a<b) {
			System.out.println(b+" is larger");
		}else {
			System.out.println(a+" and "+b+" are equal numbers");
		}
	}

	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		obj.large(2, 1);
	}
}
