package com.java.core.basics.collection;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	int empid;
	int salary;
	
	
	
	public Employee(int empid, int salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}

	public Employee( ) {
		 
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}








	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.empid-o1.empid;
	}

}

class CompareEmployeeBasedOnSalary implements Comparator<Employee>{
public CompareEmployeeBasedOnSalary() {}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.salary-o2.salary;
	}
	
}

 