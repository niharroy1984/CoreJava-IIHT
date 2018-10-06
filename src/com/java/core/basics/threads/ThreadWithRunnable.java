package com.java.core.basics.threads;

public class ThreadWithRunnable implements Runnable{

	
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadWithRunnable());
		t1.start();
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
