package com.cg.map.Treemap1;

import java.util.*;

public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<Student,String> t1=new TreeMap<Student,String>();
		t1.put(new Student(22,"anu"),"ist standard");
		t1.put(new Student(23,"manu"),"2nd standard");
		t1.put(new Student(24,"anu"),"ist standard");
		Set<Map.Entry<Student, String>> s1=t1.entrySet();
		for (Map.Entry<Student, String> e1 : s1) {
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
			System.out.println("---------------------------------");
			
		}
		
		
		
	}
	
	

}
