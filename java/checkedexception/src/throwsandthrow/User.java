package throwsandthrow;

public class User {

	public static void main(String[] args) {
		System.out.println("main stARTED");
	IRctc i1=new IRctc();
	Paytm p1=new Paytm(i1);
	p1.bookTickect();
	System.out.println("main endED");

	}

}
