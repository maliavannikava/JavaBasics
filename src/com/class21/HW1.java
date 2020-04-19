package com.class21;

public class HW1 {
	//Write program: Shape class has a constructor that takes the radius and has a subclass as  
	//circle class. In circle class create a method to calculate the area of circle. Test your code
	double radius;
	HW1(double radius){
		this.radius=radius;
	}
}

class HW11 extends HW1{
	HW11(double radius){
		super(radius);
	}
	void m1() {
		double area=radius*radius*3.14;
		System.out.println(area);
	}
}
