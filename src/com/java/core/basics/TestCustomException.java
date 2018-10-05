package com.java.core.basics;

public class TestCustomException {
public static void main(String[] args) throws IIHTCustomException {
	
	int day =0;
	
	if(day<1)
		throw new IIHTCustomException("day cant be negative");
}
}
