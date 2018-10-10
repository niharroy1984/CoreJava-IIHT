package com.java.core.basics.collection;

public class Student  {
    // if object are sam ehashcode must be same
	// if two objects are producing same hashcode , does not mean objects are same
	// obj1 obj2
	int roll;
	public Student(int roll, String classname) {
		super();
		this.roll = roll;
		this.classname = classname;
	}
	String classname;
	//obj1.equals(obj2)
	@Override
	public int hashCode() {
		
		return this.roll;
	}
	@Override
	public boolean equals(Object obj) {
		Student sudent = (Student)obj;
		if(this.roll==sudent.roll)
			return true;
		else
			return false;
		
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", classname=" + classname + "]";
	}

	
}
