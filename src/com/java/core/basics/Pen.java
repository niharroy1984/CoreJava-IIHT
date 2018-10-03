package com.java.core.basics;

public class Pen {
	
	int hieght;
	int weight;
	int price;
	String color;
	
	// init block 
	{
		System.out.println("I am init block...");
	}
	static {
		System.out.println("i am static block");
	}
	
	
	public Pen(int hieght, int weight, int price, String color) {
		System.out.println("Constructor creating object...");
		this.hieght = hieght;
		this.weight = weight;
		this.price = price;
		this.color = color;
	}
	
	Pen(){}

	
	
	// write
	// erase
	
	public void write() {
		System.out.println("I am writing!!!");
		System.out.println("current object color is:"+this.color);
		System.out.println(this);
		if(this.color.equals("Black")) {
			System.out.println("I am a black pen");
		}
		else {
			System.out.println("i am non black pen");
		}
		
	}
	
	public void erase() {
		
	}
	
	
	public static void main(String[] args) {
		Pen gelPen = new Pen(15,20,20,"Black");
		gelPen.write();
		Pen gelPen2 = new Pen(15,20,20,"Red");
		gelPen2.write();
	}

	@Override
	public String toString() {
		return "Pen [hieght=" + hieght + ", weight=" + weight + ", price=" + price + ", color=" + color + "]";
	}

}
