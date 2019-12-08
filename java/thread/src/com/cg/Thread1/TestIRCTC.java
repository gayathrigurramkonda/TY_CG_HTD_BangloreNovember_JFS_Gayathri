package com.cg.Thread1;

public class TestIRCTC {
	public static void main(String[] args) {
		System.out.println("main started");
		 IRCTC i=new IRCTC();
		User1 u1=new User1(i);
		u1.start();
		User1 u2=new User1(i);
		u2.start();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i.leaveME();
		System.out.println("main ended"+ "");
				

	}

}
