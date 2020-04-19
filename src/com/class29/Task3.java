package com.class29;

public abstract class Task3 {
		public String name;
		public int id;
		Task3(String name, int id){
			this.name=name;
			this.id=id;
		}
		public abstract void display();
	}
	class Student1 extends Task3{
		Student1(String name, int id){
			super(name, id);
		}
		public void display(){
			System.out.println("Student's name is "+name);
		}
	}
	class Student2 extends Task3{
		Student2(String name, int id){
			super(name, id);
		}
		public void display(){
			System.out.println("Student's name is "+name);
		}
	}
	class Student3 extends Task3{
		Student3(String name, int id){
			super(name, id);
		}
		public void display(){
			System.out.println("Student's name is "+name);
		}
	}
