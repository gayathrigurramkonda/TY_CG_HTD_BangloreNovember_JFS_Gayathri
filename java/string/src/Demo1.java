
public class Demo1 {
	public static void main(String[]args) {
		String s1="Mouni";
		System.out.println("s1 hashcode "+s1.hashCode());
		s1="Mouni";
		System.out.println("s1 hashcode "+s1.hashCode());
		String s3="muni";
		System.out.println("s3 hashcode "+s3.hashCode());
	}

}
//two same strings have same hashcode
//if refvariable is same then diff obj are created for diff string