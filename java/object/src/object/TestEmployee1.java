package object;

public class TestEmployee1 {
	public static void main(String arr[]) {
		Employee1 e1=new Employee1(22,"mouni");
		Employee1 e2=new Employee1(22,"mouni");
		Employee1 e3=new Employee1(224,"mouni");
		System.out.println(e1.equals(e2));
		
		System.out.println(e2.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		
		
	}

}
