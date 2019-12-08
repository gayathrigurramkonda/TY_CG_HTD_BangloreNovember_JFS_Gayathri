package com.cg.Thread1;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		Thread2 t=new Thread2();
		t.start();
		System.out.println("main ended");
	}

}
