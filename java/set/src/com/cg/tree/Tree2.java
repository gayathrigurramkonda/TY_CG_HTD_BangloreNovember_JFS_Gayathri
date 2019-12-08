package com.cg.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree2 {

	public static void main(String[] args) {
		TreeSet<Student>t1=new TreeSet<Student>();
		t1.add(new Student(21,"raj"));
		t1.add(new Student(20,"rani"));
		t1.add(new Student(23,"mantri"));
		t1.add(new Student(21,"raj"));
		
		System.out.println("------------------");
		for (Student s : t1) {
			System.out.println(s);
			
		}
		
		

	}

}
