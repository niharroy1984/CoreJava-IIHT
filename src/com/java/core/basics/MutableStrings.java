package com.java.core.basics;

public class MutableStrings {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("select * from test where ");
		StringBuffer sb2 = new StringBuffer();
		String s = "";
		
		StringBuffer sb3= sb.append(" name='none'");
		if(sb==sb3)
			System.out.println("Equals- Mutability proved");
		else
			System.out.println("not equals");
		
		if(s.equals(sb2))
			System.out.println("");
		
	}

	@Override
	public String toString() {
		return "MutableStrings []";
	}

}
