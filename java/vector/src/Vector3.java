import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(34);
		v1.add(23);
		v1.addElement(67);
		v1.addElement(78);
		System.out.println(v1);
		v1.removeElement(new Integer(34));
		System.out.println(v1);
		v1.removeElementAt(1);
		System.out.println(v1);
		Object o1[]=new Object[v1.size()];
		v1.copyInto(o1);
		for(int i=0;i<o1.length;i++) {
			System.out.println(o1[i]);
		}
		Vector v2=new Vector();
		v2.add(34);
		v2.add(23);
		v2.addElement(67);
		v2.addElement(78);
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.ensureCapacity(5);
		v2.setSize(9);
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		
		
		
		
	}

}
