package com.cg.tree;

import java.util.TreeSet;

public class Tree1 {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(21);
		t1.add(23);
		t1.add(34);
		t1.add(21);
		t1.remove(21);
		//t1.add(null);
		//t1.add("mouni");
		for (Object o : t1) {
			System.out.println(o);
			
		}

	}

}
