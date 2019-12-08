package com.cg.map.linkedhashmap;

import java.util.*;

public class LinkedHashMap1 {

	public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1=new LinkedHashMap();
	l1.put("OAR", 60017);
	l1.put("BTM", 87856);
	l1.put("BTR", 74562);
	l1.remove("BTM");
	l1.put("null",null);
	
	
	Set<Map.Entry<String,Integer>>s1=l1.entrySet();
	for ( Map.Entry<String, Integer> e1: s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("--------------------------");
		
		
	}
	Collection<Integer> c1=l1.values();
	for (Integer i1 : c1) {
		System.out.println(i1);
		
	}
	System.out.println(l1.containsKey("OAR"));
	System.out.println(l1.containsValue(87856));
	}

	}