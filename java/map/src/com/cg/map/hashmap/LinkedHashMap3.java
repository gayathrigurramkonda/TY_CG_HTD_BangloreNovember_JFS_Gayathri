package com.cg.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



public class LinkedHashMap3 {
	public static void main(String[] args) {
		LinkedHashMap<String,Student> l1=new LinkedHashMap<String,Student>();
		l1.put("1st year", new Student(22,"mouni"));
		l1.put("2nd year", new Student(23,"anu"));
		l1.put("3rd year", new Student(22,"mouni"));
		l1.put("4th year", new Student(43,"manu"));
		Set<Map.Entry<String, Student>> s1=l1.entrySet();
        for (Map.Entry<String, Student> e1 : s1) {
        	System.out.println(e1.getKey());
        	System.out.println(e1.getValue());
        	System.out.println("-------------------");
			
		}
        System.out.println(l1.containsKey(23));
        System.out.println(l1.containsValue(new Student(43,"manu")));
        System.out.println(l1.isEmpty());
        System.out.println(l1.size());
	}

}
