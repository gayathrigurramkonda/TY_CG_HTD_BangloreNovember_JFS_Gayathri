
public class Finally {
	public static void main(String[] arr) {
		System.out.println("main started");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("dont deal wit hAe");
			
		}finally {
			System.out.println("finally started");
		}
		System.out.println("main ended");
	}

}
