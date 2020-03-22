package com.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		
		String str="hello my friend";
		int length=str.length();
		
		if(length>10) {
			System.out.println("Stringis long");
		}else {
			System.out.println("String is short");
		}
		
		Methods obj=new Methods();
		
		MethodsReturningValue newObj=new MethodsReturningValue();
		int num=newObj.largest(12, 13);
		boolean flag=newObj.isOdd(num);
	}
	
	int largest(int a, int b) {
		int largest;
		if(a>b) {
			largest=a;
		}else {
			largest=b;
		}
		return largest;
	}
	
	boolean isOdd;
	
	boolean isOdd(int num) {
		if(num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		
		return isOdd;
	}
	}
