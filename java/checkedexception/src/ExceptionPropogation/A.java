package ExceptionPropogation;

public class A {

	public static void main(String[] args) {
		System.out.println("main started");
		try {
			B.n();
		} catch (ClassNotFoundException e) {
			System.out.println("class not found ");
		}
		System.out.println("ended");

	}

}
