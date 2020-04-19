package com.class21;

public class HW5 {
	
/*Create 1 class in which create a methods that will calculate the area (volume) of 
	Rectangle
	Square
	Box
	*/
	
	void m1(int a, int b) {
		int area=a*b;
		System.out.println("The area of rectangle is "+area);
	}
	void m1(int a) {
		int area=a*a;
		System.out.println("The area of square is "+area);
	}
	void m1(int a, int b, int c) {
		int area=2*(a*b)+2*(a*c)+2*(b*c);
		System.out.println("The area of box is "+area);
	}
	
	public static void main(String[] args) {
		
		HW5 obj=new HW5();
		obj.m1(10, 20);
		obj.m1(10);
		obj.m1(10,20,30);
	}
}
