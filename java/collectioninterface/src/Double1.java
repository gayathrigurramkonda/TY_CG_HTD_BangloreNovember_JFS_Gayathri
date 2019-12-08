import java.util.*;

public class Double1 {

	public static void main(String[] args) {
	ArrayList<Double> l1=new ArrayList<Double>();
	l1.add(23.45);
	l1.add(34.5);
	l1.add(43.6);
	System.out.println(l1);
	System.out.println(l1.isEmpty());
	System.out.println(l1.remove(1));
	System.out.println(l1);
	ArrayList l2=new ArrayList();
	l2.add(33.45);
	l2.add(34.5);
	l2.add(53.6);
	System.out.println(l1.removeAll(l2));
	System.out.println(l1);
	System.out.println(l1.addAll(l2));
	System.out.println(l1);
	ArrayList l3=new ArrayList();
	l3.add(63.45);
	l3.add(34.5);
	l3.add(56.6);
	ArrayList l4=new ArrayList();
	l4.add(23.45);
	l4.add(34.5);
	l4.add(43.6);
	l4.containsAll(l3);	
	System.out.println(l4);
	l4.retainAll(l3);
	System.out.println(l4);
	System.out.println(l4.size());
	System.out.println(l4.contains(34.5));
	l4.clear();
	System.out.println(l4);
	ArrayList l5=new ArrayList();
	l5.add(0,23.45);
	l5.add(1,34.5);
	l5.add(2,43.6);
	System.out.println(l5);
	System.out.println(l5.lastIndexOf(new Double(43.6)));
	l5.remove(1);
	System.out.println(l5);
	System.out.println(l5.get(1));
	l5.set(1, 23.89);
	System.out.println(l5);
	l4.addAll(l5);
	System.out.println(l3);
    System.out.println(l4.subList(0, 1));
	
	
	
	


	}

}
