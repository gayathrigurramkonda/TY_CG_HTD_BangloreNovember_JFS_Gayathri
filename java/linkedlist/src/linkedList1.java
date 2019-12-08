import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(null);
		l1.add(23);
		l1.add(12);
		System.out.println(l1);
		ListIterator itr=l1.listIterator();
		System.out.println("--------iterator-----------");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		l1.add(56);
		System.out.println("------------------for each-------");
		for(Object o1:l1) {
			System.out.println(o1);
		}
		System.out.println("----------for lopp-----------");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}

	}

}
