package com.class19;

import com.class20.Employee;

public class WaterfallTeam extends Employee{

	public static void main(String[] args) {
		
		WaterfallTeam wteam=new WaterfallTeam();
		WaterfallTeam.company="Syntax";
		wteam.empNumber=124; //--> protected is available to the child class
		//wteam.salary --> default is not visible

	}
}
