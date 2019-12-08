package com.cg.Thread1;

public class TestPVR {
	public static void main(String[] args) {
		System.out.println("main started");
	PVR p=new PVR();
	User u=new User(p);
	u.start();

	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		System.out.println("some");
		e.printStackTrace();
	}
	p.leaveMe();
	System.out.println("main ended");
	
	
		
	}

}
