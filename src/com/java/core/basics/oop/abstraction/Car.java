package com.java.core.basics.oop.abstraction;

import com.java.core.basics.oop.Animal;

public class Car  implements Vehicle{

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		System.out.println("changing gear for car");
		
	}
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		vehicle.changeGear();
	}
	
	
}
