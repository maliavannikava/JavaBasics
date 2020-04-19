package com.class20;

public class Test {

	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		obj1.company="Syntax Technologies";
		
		
		ScrumTeam obj2=new ScrumTeam();
		obj2.ceremonies="Daily stand up";
		
		Tester t=new Tester();
		t.empNumber=123456;
		t.salary=80000;
		t.work();
		t.test();
		t.getPaid();
		t.attendMeetings();
		
		ProductOwner po=new ProductOwner();
		po.empNumber=98654;
		po.salary=150000;
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stand Up";
		po.attendMeetings();
		po.prioritizeBacklog();

	}
}
