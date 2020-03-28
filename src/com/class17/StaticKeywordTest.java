package com.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();
		
		StaticKeyword obj1=new StaticKeyword();
		obj1.color="red";
		obj1.memory=128;
		
		
		StaticKeyword obj2=new StaticKeyword();
		obj2.color="red";
		obj2.memory=128;
		obj2.brand="Nokia";
		
		obj2.displayGeneralInfo();
		obj1.displayGeneralInfo();
		

	}
}
