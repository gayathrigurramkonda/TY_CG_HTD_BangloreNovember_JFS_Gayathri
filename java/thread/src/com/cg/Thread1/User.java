package com.cg.Thread1;

public class User extends Thread {
	PVR p;
	User(PVR p){
		this.p=p;
	}
	public void run() {
		p.confirmTicket();
	}
	

}
