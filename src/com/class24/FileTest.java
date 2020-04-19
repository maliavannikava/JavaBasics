package com.class24;

public class FileTest {

	public static void main(String[] args) {
		
		File java=new JavaFile();
		java.open();
		java.edit();
		java.close();
		
		File word=new WordFile();
		word.open();
		word.edit();
		word.close();
	}
}
