package com.cg.linkedshashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(20,"ammu"));
		l1.add(new Employee(21,"kittu"));
		l1.add(new Employee(22,"murali"));
		l1.add(new Employee(20,"ammu"));
		Iterator<Employee>itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
