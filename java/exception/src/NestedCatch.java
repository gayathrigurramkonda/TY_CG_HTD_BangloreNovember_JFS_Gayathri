
public class NestedCatch {
	void exception (int a,String b) {
		try {
			System.out.println(10/a);
	try {
		System.out.println(b.length());
	
		}catch(NullPointerException n){
			System.out.println("dont handle Npe");
		}
		}
			catch(ArithmeticException a1) {
		System.out.println("dont handle Ae");
	}
	
		

		}

}
