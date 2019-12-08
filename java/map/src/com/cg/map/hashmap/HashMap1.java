
package com.cg.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(7,"ranu");
		h1.put(2,"mouni");
		h1.put(4, "anu");
		h1.put(6,"manu");
		Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		for (Map.Entry<Integer, String> e : s1) {
			System.out.println(e.getValue());
			System.out.println(e.getKey());
			System.out.println("------------------------------");
			
		}
		
		

	}

}
