package com.cg.map.Treemap1;

import java.util.*;

public class TreeMap1 {
	public static void main(String[] args) {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	t1.put(23, "mouni");
	t1.put(22, "anu");
	t1.put(34, "kamu");
	t1.put(56,"janu");
	Set<Map.Entry<Integer, String>> s1=t1.entrySet();
	for (Map.Entry<Integer, String> e1 : s1) {
		System.out.println(e1.getValue());
		System.out.println(e1.getKey());
		System.out.println("---------------------------------");
		
	}
		
	}

}
