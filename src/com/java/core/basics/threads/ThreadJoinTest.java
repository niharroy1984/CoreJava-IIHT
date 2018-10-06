package com.java.core.basics.threads;

public class ThreadJoinTest {
	
	
	public static void main(String[] args) {
		
		System.out.println("I am main :"+Thread.currentThread().getName());
		
		Thread testThread = new Thread(new ThreadWithRunnable());
		testThread.start();
		try {
			testThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
   for (int i = 0; i < 100; i++) {
	
	System.out.println("thread: "+Thread.currentThread().getName());
	
}	
   
   
   
	}

}
