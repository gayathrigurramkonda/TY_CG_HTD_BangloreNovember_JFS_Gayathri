package com.cg.Thread1;

public class TestB {
public static void main(String[] args) {
	System.out.println("main started");
	Thread3 t3=new Thread3();
	Thread t=new Thread(t3);
	t.start();
	System.out.println("main ended");
}
}
