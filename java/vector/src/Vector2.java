import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(90);
		v1.add(80);
		v1.add(70);
		v1.add(60);
		v1.add(50);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.setSize(11);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		System.out.println(v1);
		v1.set(7, 500);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
	    v1.add(87);
	    System.out.println(v1);
	    System.out.println(v1.size());
	    System.out.println(v1.capacity());
		
		
		
	}

}
