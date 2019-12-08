package com.cg.Thread1;

public class IRCTC {
	synchronized void confirmTicket() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("wait");
				e.printStackTrace();
			}
		}
//			try {
//				Thread.sleep(900);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		
				
		}
 
 synchronized void leaveME() {
		System.out.println("notify called");
		notifyAll();
		
	}

}
