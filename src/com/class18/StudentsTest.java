package com.class18;

public class StudentsTest {

	public static void main(String[] args) {
		
		Students s1=new Students("Pavlik", 55, 67, 98);
		s1.average();
		Students s2=new Students("Margarita", 78, 90, 80);
		s2.average();
		Students s3=new Students("Luna", 100, 100, 100);
		s3.average();
		Students s4=new Students("Dany", 53, 28, 54);
		s4.average();
		Students s5=new Students("John", 98, 45, 34);
		s5.average();
	}
}
