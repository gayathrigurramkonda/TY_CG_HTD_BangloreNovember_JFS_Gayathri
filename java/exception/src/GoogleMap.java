
public class GoogleMap {
	void findLocation(String a) {
		try {
			System.out.println(a.length());	
		}catch(NullPointerException e1) {
			System.out.println(" google user handle NPE");
			throw e1;
		}
		
	}

}
