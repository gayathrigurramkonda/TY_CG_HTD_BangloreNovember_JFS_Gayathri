import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(23);
		l1.add(34);
		l1.add(45);
		l1.add(56);
		l1.add(65);
		System.out.println("----------------peek&peekFirst &peekLast---");
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("--------------poll &pollFirst &polllast---------");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("--------------offer &offerfirst & offer last-----");
		System.out.println(l1.offer(34));
		System.out.println(l1);
		System.out.println(l1.offerFirst(45));
		System.out.println(l1);
		System.out.println(l1.offerLast(89));
		System.out.println(l1);
	}

}
