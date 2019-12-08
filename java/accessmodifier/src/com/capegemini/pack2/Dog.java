package com.capegemini.pack2;

public class Dog {
	public String name;
	public static int age;
	 public Dog(String n){
		name=n;
		
	}
	static {
		age=24;
	}
	 public void details() {

		System.out.println("age is :"+age);
		System.out.println("name is :"+name);
		
		
	}

}
