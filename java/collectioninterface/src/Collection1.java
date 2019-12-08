import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		Collection a1=new ArrayList();
		a1.add(12);
		a1.add(2);
		System.out.println(a1);
		Collection a2=new ArrayList();
		a2.add(12);
		a2.add(21);
		a2.add(45);
		System.out.println(a2);
		System.out.println(a1.addAll(a2));
		System.out.println(a2);
		System.out.println("------------------------");
		Collection a3=new ArrayList();
		
		a3.add(12);
		a3.add(2);
		System.out.println(a3);
		Collection a4=new ArrayList();
		a4.add(12);
		a4.add(21);
		a4.add(45);
		System.out.println(a3.addAll(a4));
		System.out.println(a4);
		System.out.println(a3.removeAll(a4));
		System.out.println(a4);
		System.out.println("------------remove all------------");
		
		System.out.println(a3.retainAll(a2));
		System.out.println(a3);
		System.out.println(a3.contains(a4));
		System.out.println(a3);
		System.out.println("--------------------------------");
		Collection c5=new ArrayList();
		c5.add(12);
		c5.add(2);
		System.out.println(a1);
		Collection c6=new ArrayList();
		c6.add(12);
		c6.add(21);
		Object o[]=c6.toArray();
		for(int i=0;i<o.length;i++) {
			System.out.println(o[i]);
		}
		a2.add(45);
		System.out.println(a2);
		
		


		

	}

}
