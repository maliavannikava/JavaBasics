package com.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		int time=10;
		
		//while(time<12) {
			//System.out.println("Good Morning"); //code will execute infinetely
		//}
		
		while(time<12) {
			System.out.println("Good Morning");
			time++;
		}
		
		int num=5;
		while(num<=15) {
			System.out.println(num);
			num++;
		}
		
		int num1=10;
		while(num1>=1) {
			System.out.println(num1);
			num1--;
		}
		System.out.println("__________________");
		
		int num2=50;
		while(num2>=1) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println("__________________");
		
		int num3=1;
		while(num3<20) {
			System.out.println(num3);
			num3+=2;
		}
	}
}
