
public class Calculator {
void divide(int a,int b) {
	System.out.println("divide started");
	try {
		System.out.println(a/b);	
	}catch (ArithmeticException e){
		System.out.println("dont divide by zero");
		
	}
	
	System.out.println("divide ended");
}
}
