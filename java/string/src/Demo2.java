
public class Demo2 {
	public static void main() {
		String s1=new String("anu");
		System.out.println("s1 hashcode"+s1.hashCode());
		String s2=new String("anu");
		System.out.println("s2 hashcode"+s2.hashCode());
		s1=new String("janu");
		System.out.println("s1 hashcode"+s1.hashCode());
		String s3=new String("manu");
		System.out.println("s3 hashcode"+s3.hashCode());
		
	}

}
