package com.java.core.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyTest {

	public static void main(String[] args) {
		FinallyTest finallyTest = new FinallyTest();
		try {
			System.out.println("gonna test finally");
		//	finallyTest.exceptionThrower();
			System.out.println("finally tested");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("I got the exception- reason for my execution");
			e.printStackTrace();
		}
		finally {
			System.out.println("I am king here , i get chance in all cases.");
		}
		
		
		//finallyTest.readFile();
		finallyTest.readFileWithARM();
		
	}
	void exceptionThrower() throws Exception{
		throw new Exception();
	}
	
	
	 void readFile() {
		 FileReader fileReader=null;
		 try {
			  fileReader = new FileReader(new File("/Users/mohammad.shadab/git/CoreJava-IIHT/src/com/java/core/basics/FinallyTest.java"));
			// reading the content ,n and exception may occur
			int content=0;
			while(content!=-1) {
				
				try {
					content= fileReader.read();
					System.out.println((char)content);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		 
		 finally {
				
				// close resource
							try {
								fileReader.close();
							} catch (IOException ex) {
								// TODO Auto-generated catch block
								ex.printStackTrace();
							}
		}
	 }
	 
	 
	 void readFileWithARM() {
 		 try(FileReader fileReader = new FileReader(new File("/Users/mohammad.shadab/git/CoreJava-IIHT/src/com/java/core/basics/FinallyTest.java"))) {
			  
			// reading the content ,n and exception may occur
			int content=0;
			while(content!=-1) {
				
				try {
					content= fileReader.read();
					System.out.println((char)content);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		 

	 }
}


