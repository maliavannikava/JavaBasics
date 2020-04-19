package com.class22;

public class CreditCard {
	
	//Create a class CreditCard and define variable balance and interest. 
	//Create an instance method that will calculate interest based on the given balance. 
	//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
	//Call the method by creating an object of each of the three classes.
	
	double balance, interest;
	
	CreditCard(double balance){
		this.balance=balance;
	}
	
	void inter() {
		if(balance<3000) {
			interest=0;
		}else {
			interest=balance*1.2;
		}
		System.out.println("Interest is "+interest);
	}

}

class Visa extends CreditCard{
	
	Visa(double balance){
		super(balance);
	}
	
}
class AX extends CreditCard{
	
	AX(double balance){
		super(balance);
	}
	void inter() {
		if(balance<500) {
			interest=0;
		}else {
			interest=balance*1.2;
		}
		System.out.println("Interest is "+interest);
	}
}
