package com.class19;

public class BookTask {
	
	//Write program as a Book class, that will have 2 Constructors. 
	//While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed
	
	String book1, book2;
	
	BookTask(String b1, String b2){
		this.book1=b1;
		this.book2=b2;
		System.out.println(book1+" & "+book2);
	}
	BookTask(String b3){
		this("The God Father", "Harry Potter");
		System.out.println(b3);
	}
	

	public static void main(String[] args) {
		
		BookTask obj=new BookTask("The Witcher");	
	}
}
