import java.util.LinkedList;

public class LinkedList5 {

	public static void main(String[] args) {
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("h");
		l1.add("e");
		l1.add("l");
		l1.add("l");
		l1.add("o");
		System.out.println(l1);
		l1.addFirst("h");
		System.out.println(l1);
		l1.addLast("w");
		System.out.println(l1);
		l1.add(3, "k");
		System.out.println(l1);
		l1.push("u");
		System.out.println(l1);
		l1.removeFirstOccurrence("l");
		System.out.println(l1);
		l1.removeLastOccurrence("h");
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1);
		System.out.println("______peek------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println("------------poll-----------");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("----------offer----------");
		System.out.println(l1.offer("w"));
		System.out.println(l1);
		System.out.println(l1.offerFirst("t"));
		System.out.println(l1);
		System.out.println(l1.offerLast("z"));
		System.out.println(l1);
		l1.push("s");
		System.out.println(l1);
		l1.pop();
		System.out.println(l1);
		l1.element();
		System.out.println(l1);
		for(Object o:l1) {
			System.out.println(o);
		}
		
		
		
		
		

	}

}
