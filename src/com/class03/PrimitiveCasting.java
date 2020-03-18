package com.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=10;
		System.out.println(d); //10.0
		
		//int i=10.99 --> error
		
		int i=(int) 10.99; //if you want to fit bigger value in smaller variable
		System.out.println(i);
		
		byte b=(byte)1284; //will give weird output 
		System.out.println(b);

	}

}
