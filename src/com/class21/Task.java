package com.class21;

public class Task {
	//Write program: userClass  that has a constructor that initializes instance variable name 
	//and mobile number. Create a subclass  userInfo that will have user address variable and it 
	//also being initialized through constructor call. Print users name, mobile number and address 
	//in userDetails method. Test your code.
	
	String name;
	long number;
	Task(String name, long number){	
		this.name=name;
		this.number=number;
	}
	}

class UserInfo extends Task{
	String address;
	
	UserInfo(String name, long number, String address){
		super(name, number);
		this.address=address;
	}
	void userDetails(){
		System.out.println(name+" "+number+" "+address);
	}
}




