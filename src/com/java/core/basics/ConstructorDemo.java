package com.java.core.basics;

public class ConstructorDemo {
	
	int constructornumber ;
	String nyName;
	boolean byBool;
	
	ConstructorDemo(){
		//System.out.println("Constructor being executed.");
	}
	
	ConstructorDemo(int constructornumber,String nyName,boolean byBool){
 		this.constructornumber = constructornumber;
		this.nyName = nyName;
		this.byBool = byBool;
 	}
	
	
	public static void main(String[] args) {
		// object cration
		System.out.println("before object creation");
		ConstructorDemo myConstructorDemoObject =	new ConstructorDemo();
		ConstructorDemo myConstructorDemoObject1 =	new ConstructorDemo();
		ConstructorDemo myConstructorDemoObject2 =	new ConstructorDemo();
		ConstructorDemo myConstructorDemoObject3 =	new ConstructorDemo();
		System.out.println("after object creation");
		
		System.out.println("Object Property is:"+myConstructorDemoObject1.byBool);
		
		ConstructorDemo constructorDemo =  new ConstructorDemo(10,"Test",true);
		
		System.out.println("constructornumber:"+constructorDemo.constructornumber);
		System.out.println("nyName:"+constructorDemo.nyName);

		System.out.println("byBool:"+constructorDemo.byBool);
		
		System.out.println("---------------------------------");
		
    ConstructorDemo constructorDemo2 =  new ConstructorDemo(12,"Test2",false);
		
		System.out.println("constructornumber:"+constructorDemo2.constructornumber);
		System.out.println("nyName:"+constructorDemo2.nyName);

		System.out.println("byBool:"+constructorDemo2.byBool);
   

		
	}

}
