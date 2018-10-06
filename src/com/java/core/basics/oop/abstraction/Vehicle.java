package com.java.core.basics.oop.abstraction;

public interface Vehicle {

	void changeGear();
   //void dummy();
	
	default void dummy() {
		
		System.out.println("dummy 1");
	}
	
	static void dummy2() {
		
		System.out.println("dummy 2");
		
	}
	
}
