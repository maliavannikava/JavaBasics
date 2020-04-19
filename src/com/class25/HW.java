package com.class25;

public class HW {

}
class Parent{
	  public void m1(){
	    System.out.println("I am parent public method");
	  }
	  protected void m2(){
	    System.out.println("I am parent protected method");
	  }
	  void m3(){
	    System.out.println("I am parent default method");
	  }
	  private void m4(){
	    System.out.println("I am parent private method");
	  }
	}
class Child extends Parent{
	   public void m1(){
	    System.out.println("I am child public method");
	  }
	  protected void m2(){
	    System.out.println("I am child protected method");
	  }
	  void m3(){
	    System.out.println("I am child default method");
	  }
	  private void m4(){
	    System.out.println("I am child private method");
	  }
	}