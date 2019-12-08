package com.cg.tree;

public class Employee implements Comparable<Employee>{
	int age;
	String name;
	Double salary;
	public  Employee(int age, String name, Double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	//@Override
	//public int compareTo(Employee o) {
		// 
		//return this.name
	//}
	
	//@Override
	//public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return 0;
	//*@Override
	public int compareTo(Employee o) {
		if(this.age > o.age) {
			return 1;
		}else if(this.age<  o.age){
			return -1;
			
		}else {
		return 0;
		}
	}
	}
	

	


	
