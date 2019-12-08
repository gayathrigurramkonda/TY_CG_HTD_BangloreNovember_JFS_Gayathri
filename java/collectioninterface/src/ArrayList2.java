import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("hi");
		a1.add("hello");
		a1.add("namaste");
		a1.add("vanakkam");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(1));
		System.out.println(a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("hina");
		a2.add("hell");
		a2.add("mouni");
		a2.add("vani");
		a2.add("hi");
		System.out.println(a1.addAll(a2));
		System.out.println(a1);
		System.out.println(a1.removeAll(a2));
		System.out.println(a1);
		System.out.println(a1.containsAll(a2));
		System.out.println(a1);
		System.out.println(a1.retainAll(a2));
		System.out.println(a1);
		ArrayList<String> a3=new ArrayList<String>();
		a3.add(0,"N");
		a3.add(1,"A");
		a3.add(2,"S");
		a3.add(3,"T");
		System.out.println(a3);
		System.out.println(a3.remove(3));
		System.out.println(a3);
		System.out.println();
		ArrayList<String> a4=new ArrayList<String>();
		a4.add(0,"N");
		a4.add(1,"A");
		a4.add(2,"S");
		a4.add(3,"T");
		a4.add(4,"E");
		a4.add(5,"M");
		System.out.println(a3.lastIndexOf(a4));
		System.out.println(a3.get(1));
		System.out.println(a3.addAll(a4));
		System.out.println(a3);
		System.out.println(a3.set(2, "hi"));
		System.out.println(a3);
		System.out.println(a3.subList(0, 5));
		System.out.println("for------------");
		for(int i=0;i<a3.size();i++) {
			System.out.println(a3.get(i));
		}
		System.out.println("iterator next------------");
		Iterator<String>itr=a3.iterator();
		
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("list previous");
				ListIterator<String>itr1=a1.listIterator(a3.size());
				while(
						itr1.hasPrevious()) {
					System.out.println(itr1.previous());
				}

		
		
		
		

	}

}
