package com.java.core.basics.oop;

public class OverloadingTest {
	
	public static void main(String[] args) {
		int result =addNumbers(2,3);
		System.out.println(result);
		
		int result2 = addNumbers(2, 3, 5);
		
		System.out.println(result2);
	}
	
	static int addNumbers(int number1, int number2) {
		
		return number1+number2;
		
	}
	
static int addNumbers(int number1, int number2, int number3) {
		
		return number1+number2+number3;
		
	}


void hitDB(String dbname, String url) {
	
}

void hitDB(String stranevalue) {
	// get the values required for hitDB actually using stranevalue
//	actual required
	//hitDB();
}
}
