package com.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer[] comp= {new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell")};
		for(Computer c:comp) {
			c.OS();
			c.display();
		}
	}
}
