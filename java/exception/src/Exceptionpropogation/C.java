package Exceptionpropogation;

public class C {
	static void m() {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("handle /0");
			throw e;
		}
		
	}

}
