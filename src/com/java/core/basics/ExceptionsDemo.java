package com.java.core.basics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {
	// try
	// catch
	// throws 
	// throw
	// finally
	// ARM
	// Custom Exception
	
	//getGrade====>xyz====>main===>jvm===>terminate
	//IOException--->Filenotofound,excption2,excption33
	
	public static void main(String[] args) {
		
		System.out.println(" Exceptions Demo gonna Start!!!!");
		System.out.println("Runtime");
		ExceptionsDemo exceptionsDemo = new ExceptionsDemo();
		exceptionsDemo.getGrade(450);
		//exceptionsDemo.getGrade(250);
		System.out.println("Runtime End!!");
		
		System.out.println("-------------------");
		
		System.out.println("Compile time exceptions!!!");
		try {
		System.out.println("gonna execute bad code");
		exceptionsDemo.calculateResult(1);
		System.out.println("bad code passed succussfully");
		}
		
		catch (FileNotFoundException exception) {
			// TODO: handle exception
			System.out.println("I have been used to catch your faults");
			exception.printStackTrace();
		}
		
		catch (IOException exception) {
			// TODO: handle exception
			System.out.println("I have been used to catch your faults");
			exception.printStackTrace();
		}
		
		System.out.println("Compiletime exception Ends!!!");
		
		
		
		System.out.println("--------Lets Handle RunTime Exception");
		
		try {
			exceptionsDemo.getGrade(250);
		}
		catch (NullPointerException nullPointerException) {
			// TODO: handle exception
			nullPointerException.printStackTrace();
		}
		
		
		try {
			exceptionsDemo.multipleExceptionTest();
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			exceptionsDemo.testThrowException();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Exceptions Demo Ended !!!!");
		
	}
	
	// Compile time exception/checked exception
	void calculateResult(int rollnumber) throws FileNotFoundException{
		
		System.out.println("Hello i am claculating result");
		if(rollnumber<100)
			throw new FileNotFoundException();
			
	}
	
	// Run time exception/unchecked exception
	void getGrade(int totalScore) throws NullPointerException{
		
		System.out.println("Hello iam getting grades");
		if(totalScore<400)
			throw new NullPointerException("Invalid marks");
		
	}
	
 		void multipleExceptionTest() throws FileNotFoundException,ClassNotFoundException {
			
			System.out.println("Hello iam multipleExceptionTest ");
			
			
			}
  		void testThrowException() throws FileNotFoundException {
 			calculateResult(12);
 		}
}