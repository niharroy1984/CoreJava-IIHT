package com.java.core.basics.oop.abstraction;

public class EducationImplementation extends Education{

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("study");
		
	}
public static void main(String[] args) {
	Education education = new EducationImplementation();
	education.study();
	education.getResults();
 }


@Override
public void getResults() {
	// TODO Auto-generated method stub
System.out.println("hey i am from edu impl");}
}
