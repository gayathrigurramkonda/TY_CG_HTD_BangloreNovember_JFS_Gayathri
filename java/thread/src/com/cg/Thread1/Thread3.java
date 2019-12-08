package com.cg.Thread1;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
		
	}

}
