package com.cg.tree;

public class Student implements Comparable<Student> {
	int Studage;
	String studName;
	public Student(int studage, String studName) {
		super();
		Studage = studage;
		this.studName = studName;
	}
	@Override
	public int compareTo(Student o) {
		if(this.Studage>o.Studage) {
			return 1;
		}else if(this.Studage<o.Studage){
			return-1;
			
		}else {
			return 0;	
		}
		
	}
	@Override
	public String toString() {
		System.out.println("student name "+studName+"Student age " +Studage);
		return super.toString();
	}
	
	

}
