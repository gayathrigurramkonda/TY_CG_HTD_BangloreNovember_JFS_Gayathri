package com.cg.hashset;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Student> h=new HashSet<Student>();
		h.add(new Student(23,"mouni"));
		h.add(new Student(23,"mouni"));
		h.add(new Student(22,"hanu"));
		h.add(new Student(21,"lolly"));
		for (Student s : h){
			System.out.println(s.studAge+"stud name "+s.studName);
			
		}
		
		

	}

}
