package com.class25;

public interface Trustable {
	void trust();
}

interface Bank extends Trustable{
	void deposit();
	void withdraw();
}

interface CreditUnion{
	void giveCredit();
}
class Finance{
	void financing() {
		System.out.println();
	}
}

class BOA extends Finance implements Bank, CreditUnion{

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
	}

	@Override
	public void deposit() {
		System.out.println("You can make a deposit in BOA");
	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw money from BOA");
	}
	public void giveCredit() {
		System.out.println("BOA can give you credit");
	}
	
}