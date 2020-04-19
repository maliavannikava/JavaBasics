package com.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task3Test {

	public static void main(String[] args) {
		//Create a Set collection that will hold Objects of Student Type. 
		//In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. Display name of each student.
		
		Set<Task3> student=new HashSet<>();
		student.add(new Student1("Margaritka", 12345));
		student.add(new Student1("Pavlik", 14961));
		student.add(new Student1("Luna", 98765));
		
		for(Task3 s:student) {
			s.display();
		}
		
	}
}

