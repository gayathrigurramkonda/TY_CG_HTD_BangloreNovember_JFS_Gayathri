package com.cg.Thread1;

public class PVR {
	 synchronized void confirmTicket() {
		for(int i=0;i<7;i++) {
			System.out.println(i);
		//*try {
			//Thread.sleep(600);
		//} catch (InterruptedException e) {
			
			//System.out.println(e.getMessage());
		//}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	 }
		synchronized void leaveMe() {
			System.out.println("notify called");
			notify();
		
	}
	

}
