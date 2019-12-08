package com.cg.priorityqueue;

public class Student implements Comparable<Student> {
	int StudAge;
	String studName;
	public Student(int studAge, String studString) {
		super();
		StudAge = studAge;
		this.studName = studName;
	}
	@Override
	public int compareTo(Student o) {
		return this.studName.compareTo(o.studName);
	}
	
	

}
