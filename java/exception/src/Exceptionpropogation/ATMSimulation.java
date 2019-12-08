package Exceptionpropogation;

public class ATMSimulation {
	void withdraw(double amount) {
		if (amount>40000) {
			System.out.println("day limit exceeds");
		}
	}

}
