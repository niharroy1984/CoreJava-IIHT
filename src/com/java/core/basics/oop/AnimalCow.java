package com.java.core.basics.oop;

public class AnimalCow extends Animal{
	
	public static void main(String[] args) {
		AnimalCow animalCow = new AnimalCow();
		System.out.println(animalCow.color);
		animalCow.eatFood();
	}
	
	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
		System.out.println("I am eating food , How a cow eats");
	}

}
