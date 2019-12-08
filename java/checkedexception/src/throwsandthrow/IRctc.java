package throwsandthrow;

public class IRctc {
	void Confirmticket() throws ClassNotFoundException {
		try {
			Class.forName("throwsandthrow.Paytm");
			System.out.println("ticket is confirmed by IRCTC");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found");
			throw e;
		}
		
		
	}

}
