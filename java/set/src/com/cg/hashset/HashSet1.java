package com.cg.hashset;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(90);
	hs.add(80);
	hs.add(70);
	hs.add(null);
	for(Object o:hs) {
		System.out.println(o);
	}
	HashSet<String>h2=new HashSet<String>();
	h2.add("mouni");
	h2.add("rishi");
	h2.add(null);
	h2.add(null);
	
	h2.add("harry");
	for(String s:h2) {
		System.out.println(s);
	}
	//Iterator <String>itr=new Iter
	
		
	
	
}
}
