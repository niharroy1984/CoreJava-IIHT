package com.java.core.basics;

public class EmployeetestForToString {
	
	
	public EmployeetestForToString(String name, int emplId) {
 		this.name = name;
		this.emplId = emplId;
	}



	@Override
	public String toString() {
		System.out.println(name);
		return  name ;
	}



	String name; 
	int emplId;
	
	
	
	public static void main(String[] args) {
		EmployeetestForToString employeetestForToString = new EmployeetestForToString("test",123);
		System.out.println(employeetestForToString);
		
		String employeName2 = "test";
		
		if(employeName2.equals(employeetestForToString.toString()))
			System.out.println("equal");
		else
			System.out.println(" not equal");
	}

}
