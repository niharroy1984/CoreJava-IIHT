package com.java.core.basics;

public class StringTest {
	public static void main(String[] args) {
		//strings are immutable
		String name = "IIHT" ;// string pool
		String nameWithNew = new String("IIHT");// heap memory
		String modified=nameWithNew+"-Test"; 
		
		String name1 = new String ("test");// #1234$
		String name2 = new String ("test");// #32$22
		
		if(name1.equals(name2))
			System.out.println("both are equal");
		System.out.println("-----------------------------------");
		if(name1== name2)
			System.out.println("both are equal");
		else
			System.out.println("not equal");
		
		
		String session = "java"; // #234#23
		String newSession = "java"; // #234#23
		
		
		if(session.equals(newSession))
			System.out.println("both are equal");
		System.out.println("-----------------------------------");
		if(session== newSession)
			System.out.println("both are equal");
		else
			System.out.println("not equal");
		
		String day = new String("java"); 
		String dayObjectFromPool= day.intern();
		
		
				System.out.println("----------------------------");
				
				if(newSession==dayObjectFromPool)
					System.out.println("both are equal");
				else
					System.out.println("not equal");
				
				
System.out.println("----------------------------");
				
				if(nameWithNew==modified)
					System.out.println("both are equal");
				else
					System.out.println("not equal- Immutability proved");
	String welcomeMessage=	"hello-how-are-you";
	System.out.println(welcomeMessage.split("-")[0]);
	System.out.println(welcomeMessage.length());
String month ="jan"	;
String month2 ="Jan";
if(month.equalsIgnoreCase(month2))
	System.out.println("month are equal");
else
	System.out.println("month are not equal");
		
	}

}
