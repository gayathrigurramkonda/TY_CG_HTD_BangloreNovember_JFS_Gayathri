import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	System.out.println(a1);
	System.out.println("for loop");
	for(int i=0;i<a1.size();i++) {
		System.out.println(a1.get(i));
		
	}
	System.out.println("for each loop");
	for(Integer i1: a1) {
		System.out.println(i1);
	}
	System.out.println("list next");
	Iterator<Integer>itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("list previous");
	ListIterator<Integer>itr1=a1.listIterator(a1.size());
	while(itr1.hasPrevious()) {
		System.out.println(itr1.previous());
	}

	}

}
