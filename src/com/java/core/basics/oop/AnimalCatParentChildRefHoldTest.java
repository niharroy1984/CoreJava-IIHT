package com.java.core.basics.oop;

public class AnimalCatParentChildRefHoldTest extends Animal{
public static void main(String[] args) {
	
	AnimalCatParentChildRefHoldTest animalCatParentChildRefHoldTest = new AnimalCatParentChildRefHoldTest();
	// holding child object into parent refernce.
	Animal animal = new AnimalCatParentChildRefHoldTest();
	
	// holding parent object into child- INVALID
	//AnimalCatParentChildRefHoldTest animalCatParentChildRefHoldTest2 = new Animal();
	
	
	
	
}


@Override
	public void eatFood() {
		// TODO Auto-generated method stub
System.out.println("cat is eating");	}
}
