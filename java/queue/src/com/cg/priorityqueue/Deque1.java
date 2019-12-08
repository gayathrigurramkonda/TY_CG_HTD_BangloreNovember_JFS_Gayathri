package com.cg.priorityqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque1 {
	public static void main(String[] args) {
		ArrayDeque<String> d1=new ArrayDeque<String>();
		d1.add("H");
		d1.add("E");
		d1.add("L");
		d1.add("L");
		d1.add("O");
		System.out.println(d1);
		d1.addFirst("H");
		d1.addLast("I");
		System.out.println(d1);
		System.out.println(d1.getFirst());
		System.out.println(d1.getLast());
		Iterator<String> itr=d1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
