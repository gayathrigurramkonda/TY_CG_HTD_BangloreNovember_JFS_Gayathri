
public class TeatCalculator {

	public static void main(String[] args) {
	Calculator c1=new Calculator();
	int  r1=c1.add(10);
	System.out.println("result is "+r1);
	int r2=c1.add(10,20);
	System.out.println("result is "+r2);
	double r3=c1.add(10.3+20.5);
	
	System.out.println("result is "+r3);
	Calculator.multiply(21);
	Calculator.multiply(21,23);
	Calculator.multiply(21.34,21.34);
	
	

	}

}
