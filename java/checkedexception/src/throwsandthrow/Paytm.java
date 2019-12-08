package throwsandthrow;

public class Paytm {
	IRctc i1;

	public Paytm(IRctc i1) {
		super();
		this.i1 = i1;
	}
	void bookTickect() {
		try {
			i1.Confirmticket();
			System.out.println("ticket is confirmed by paytm");
		} catch (ClassNotFoundException e) {
			System.out.println("class is not found");
		}
	}
	

}
