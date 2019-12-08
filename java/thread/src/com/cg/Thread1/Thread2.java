package com.cg.Thread1;

public class Thread2 extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
