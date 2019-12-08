package com.cg.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		p1.offer(new Student(21,"mouni"));
		p1.offer(new Student(22,"anu"));
		p1.offer(new Student(22,"sam"));
		for (Student s : p1) {
			System.out.println(s);
			
		}
		

	}

}
