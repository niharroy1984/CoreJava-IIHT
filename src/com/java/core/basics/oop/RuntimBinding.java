package com.java.core.basics.oop;

public class RuntimBinding {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal animal2 = new Dog();//.runDog();
		Dog dog = new Dog();
		//Dog animal3 = new Animal();
		
		animal.eatFood();
		animal2.eatFood();
		//animal2.runDog();
		
	}
	

}

class Dog extends Animal{
	
	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
System.out.println("Dog is eating");	

	}
	
	public void runDog() {
		System.out.println("dog is running");
	}
	
}
