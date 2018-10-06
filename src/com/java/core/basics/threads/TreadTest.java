package com.java.core.basics.threads;

public class TreadTest extends Thread{
public static void main(String[] args) {
	
	TreadTest thTest = new TreadTest();
	TreadTest thTest2 = new TreadTest();
	
	System.out.println("I am main thread:  "+Thread.currentThread().getName());
	thTest.setName("first");
	thTest2.setName("second");
	thTest.start();
	thTest2.start();
	System.out.println("again i am main thread : "+Thread.currentThread().getName());
	
}

@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("i am test thread my name is: "+Thread.currentThread().getName());
for (int i = 0; i < 10; i++) {
	
	System.out.println("Current iteration is:"+i  +"  Thread name is :"+Thread.currentThread().getName());
	
}
}
}
