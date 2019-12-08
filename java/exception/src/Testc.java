
public class Testc {
	public static void main(String arr[]) {
		System.out.println("main started");
		int a[]= new int [2];
		a[0]=8;
		a[1]=9;
		try {
		a[2]=23;
		System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("out");
			
		}
		System.out.println("ended main");
		
		
	}

}
