package com.class24;

public class PhoneTest {

	public static void main(String[] args) {
		
		
		Phone iphone=new iPhone();
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		Phone samsung=new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
	}
}
