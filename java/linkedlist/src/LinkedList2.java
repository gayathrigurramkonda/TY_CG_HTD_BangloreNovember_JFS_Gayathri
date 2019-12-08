import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(null);
		System.out.println(l1);
		l1.addFirst(23);
		System.out.println(l1);
		l1.addLast(34);
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2.add(22);
		l2.add(45);
		l2.add(22);
		System.out.println(l2.remove());
		System.out.println(l2);
		l2.add(2, 34);
		l2.removeFirst();
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		LinkedList l3=new LinkedList();
		l3.add(22);
		l3.add(45);
		l3.add(22);
		
		l3.removeFirstOccurrence(22);
		System.out.println(l2);
		l3.removeLastOccurrence(22);
		System.out.println(l3);
		l3.add(46);
		System.out.println(l3.getFirst());
		System.out.println(l3.getLast());
		
		
		
	}

}
