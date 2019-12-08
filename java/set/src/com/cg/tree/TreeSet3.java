package com.cg.tree;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
	EmployeeAge e1=new EmployeeAge();
	EmployeeName e2=new EmployeeName();
	EmployeeSalary e3=new EmployeeSalary();
	
		TreeSet<Employee>t1=new TreeSet<Employee>(e1);
		t1.add(new Employee(22, "mouni",1200.0));
		t1.add(new Employee(23,"ani",15000.0));
		t1.add(new Employee(22,"mouni",12000.0));
		for(Employee employee:t1) {
			System.out.println("employee name is "+employee.name);
			System.out.println("employee age is "+employee.age);
			System.out.println("employee salary is "+employee.salary);
			System.out.println("-------------------------------------");
		}
		

	}

}
