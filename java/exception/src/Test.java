
public class Test {
	void write() {
		String s1=null;
		try {
			System.out.println(s1.length());
		}catch(NullPointerException e) {
			System.out.println("dont do");
		}
		
	}
	public static void main(String arr[]) {
		System.out.println("main started");
		Test b1=new Test();
		b1.write();
		System.out.println("main ended");
	}

}
