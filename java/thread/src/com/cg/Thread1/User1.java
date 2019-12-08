package com.cg.Thread1;

public class User1 extends Thread {
	IRCTC i;

	
	public User1(IRCTC i) {
		super();
		this.i = i;
	}
	public void run() {
		i.confirmTicket();
	}
	

}
