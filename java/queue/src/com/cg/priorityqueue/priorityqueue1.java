package com.cg.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue1 {

	public static void main(String[] args) {
		Queue p1=new PriorityQueue();
		p1.offer(76);
		p1.offer(34);
		p1.offer(45);
		p1.offer(23);
		p1.offer(13);
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.add(6);
		System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println(p1.element());
		System.out.println("-----------");
		for (Object o : p1) {
			System.out.println(o);
			
		}
		

	}

}
