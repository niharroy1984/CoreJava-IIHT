package com.java.core.basics;

public class ModerSwitchTest {

	
	public static void main(String[] args) {
		String sessionName="TS";
		//ModerSwitchTest moderSwitchTest = new ModerSwitchTest();
				switchTest(sessionName);
	}
	
	public static void switchTest(String sessionName) {
		
		switch (sessionName) {
		case "java":
			System.out.println("Hello this is java session");
			break;
case "C":
	System.out.println("Hello this is C session");
			
			break;

		default:
			System.out.println("default");
			break;
		}
	}
}
