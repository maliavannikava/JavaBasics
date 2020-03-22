package com.class15;

public class Google {

		
		// define features such as employee id, name, last name, salary, title
		// define a behavior working, get paid, attending meetings 
		
		int empID;
		double salary;
		
		String name, lastName, title;
		
		void working() {
			System.out.println(title+" is working");
			
		}
		
		void getPaid() {
			System.out.println(name+" is getting paid "+salary);
		}
		
		void attendMeetings() {
			System.out.println(name+" attending meeting");
		}
		public static void main(String[] args) {
			
			Google emp1=new Google();
			
			emp1.empID=123;
			emp1.name="John";
			emp1.lastName="Smith";
			emp1.title="CEO";
			emp1.salary=200000;
			
			emp1.working();
			emp1.working();
			emp1.attendMeetings();
			
			Google emp2=new Google();
			emp2.empID=124;
			emp2.name="Margarita";
			emp2.lastName="Malevan";
			emp2.title="QA Engineer";
			emp2.salary=100000;
			emp2.working();
			emp2.getPaid();
			emp2.getPaid();
			emp2.attendMeetings();		
	}
}
