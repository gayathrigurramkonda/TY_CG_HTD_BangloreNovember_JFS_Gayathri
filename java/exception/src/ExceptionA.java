
public class ExceptionA {
	void exception(int a,String b) {
		try {
			System.out.println(500/a);
			System.out.println(b.length());
			
		}catch(ArithmeticException e) {
			System.out.println("dont handle Ae");
			
		}catch(NullPointerException s) {
			System.out.println("dont handle NPE");
			
			
		}
		
	
		
	}

}
