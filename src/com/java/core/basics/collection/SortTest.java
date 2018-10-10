package com.java.core.basics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>(); 
		
		Employee employee1 = new Employee(123, 20);
		Employee employee2 = new Employee(124, 21);
		Employee employee3 = new Employee(125, 19);
		Employee employee4 = new Employee(123, 25);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println(list);
		Collections.sort(list, new Employee());
		System.out.println(list);
		
		Collections.sort(list, new CompareEmployeeBasedOnSalary());
		System.out.println(list);
	}

}
