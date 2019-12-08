package com.cg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkesHashMap2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(44, new Employee(22,"mouni"));
		l1.put(34, new Employee(23,"anu"));
		l1.put(12, new Employee(43,"manu"));
		Set<Map.Entry<Integer, Employee>> s1=l1.entrySet();
        for (Map.Entry<Integer, Employee> e1 : s1) {
        	System.out.println(e1.getKey());
        	System.out.println(e1.getValue());
        	System.out.println("-------------------");
			
		}
        System.out.println(l1.containsKey(23));
        System.out.println(l1.containsValue(new Employee(43,"manu")));
        System.out.println(l1.isEmpty());
        System.out.println(l1.size());
	}

}
