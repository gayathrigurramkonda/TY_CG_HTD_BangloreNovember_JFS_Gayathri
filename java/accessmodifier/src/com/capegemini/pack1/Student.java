package com.capegemini.pack1;

public class Student {
	protected String stuname;
	 protected Student( String name){
		stuname=name;
		
	}
	protected void details() {
		System.out.println("name is:"+stuname);
	}
	public static void main() {
	Student s1=new Student("nani");
	 s1.details();
	}
	

}
