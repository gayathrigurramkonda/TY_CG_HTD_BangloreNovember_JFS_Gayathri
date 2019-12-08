package com.cg.map.hashArray;



import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {
	TreeMap<String,ArrayList<Student>> t1=new TreeMap<String,ArrayList<Student>>();
	ArrayList<Student>a1=new ArrayList<Student>();
    a1.add(new Student(22,"mouni"));
    a1.add(new Student(23,"anu"));
    a1.add(new Student(24,"raju"));
    ArrayList<Student>a2=new ArrayList<Student>();
    a2.add(new Student(22,"mouni"));
    a2.add(new Student(23,"anu"));
    a2.add(new Student(24,"raju"));
    t1.put("2nd sandard", a2);
    t1.put("1st standard", a1);
    Set<Map.Entry<String, ArrayList<Student>>> s1=t1.entrySet();
	for (Map.Entry<String, ArrayList<Student>> e1 : s1) {
		System.out.println(e1.getValue());
		System.out.println(e1.getKey());
		System.out.println("---------------------------------");
		
	}
    
	

	}



}
