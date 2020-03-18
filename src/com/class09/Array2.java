package com.class09;

public class Array2 {

	public static void main(String[] args) {
		
		String[] students=new String[3];
		students[0]="Margarita";
		students[1]="Pasha";
		students[2]="Anton";
		//students[3]="Ahmet";
		
		System.out.println(students);
		
		String[] OnlineStudents=new String[5];
		OnlineStudents[1]="Margarita";
		OnlineStudents[2]="Pasha";
		OnlineStudents[3]="Liza";
		OnlineStudents[4]="Andrei";
		//OnlineStudents[5]="Ahmet"; --> error
		System.out.println(OnlineStudents[1]);
	}
}
