package com.java.core.basics.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapTest {

public static void main(String[] args) {
/*	Map<String,String> map = new HashMap<String,String>();
	map.put("name","test");
	map.put("session","collection");
	map.put("name","testt2");
	System.out.println(map.get("name"));
	*/
	
	/*Map<Student,String> map = new HashMap<Student,String>();
	
	Student student1 = new Student(100, "cse");
	Student student2 = new Student(101, "cse");
	Student student3 = new Student(102, "ec");
	Student student4 = new Student(100, "ce");
	
	map.put(student1, "hello student 1");
	map.put(student2, "hello student 2");
	map.put(student3, "hello student 3");
	System.out.println(map);
	map.put(student4, "hello student 4");
	System.out.println("replacing");
	System.out.println(map);
	*/
	
	Student student1 = new Student(100, "cse");
	Student student2 = new Student(101, "cse");
	Student student3 = new Student(102, "ec");
	Student student4 = new Student(100, "ce");
	
	Set<Student> set = new HashSet<Student>();
	set.add(student1);
	set.add(student2);
	set.add(student3);
	System.out.println(set);
	System.out.println("duplicate gonna add");
	set.add(student4);
	System.out.println(set);
	
	Set<Vehicle> vehicleSet = new TreeSet<>();
	vehicleSet.add(new Vehicle(2010, "Test1"));
	vehicleSet.add(new Vehicle(2011, "Test2"));
	vehicleSet.add(new Vehicle(2009, "Test3"));
	
	System.out.println(vehicleSet);
	
	
	
}	
}
