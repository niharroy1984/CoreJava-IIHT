package com.java.core.basics.collection;

public class Vehicle implements Comparable<Vehicle>{

	public Vehicle(int model, String vehicleName) {
 		this.model = model;
		this.vehicleName = vehicleName;
	}

	int model;
	String vehicleName;
	
	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return this.model-o.model;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", vehicleName=" + vehicleName + "]";
	}

}
