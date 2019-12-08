
package Exceptionpropogation;

public class SBIATM {

	public static void main(String[] args) {
		System.out.println("main started");
		ATMSimulation a1=new ATMSimulation ();
		try {
			a1.withdraw(45000);
		}catch(DaylLimitException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("main ended");
		

	}

}
