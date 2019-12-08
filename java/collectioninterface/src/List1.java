import java.util.*;

public class List1 {

	public static void main(String[] args) {
ArrayList l1=new ArrayList();
l1.add(0,12);
l1.add(1,23);
l1.add(2,34);
l1.add(3,45);
System.out.println(l1);///add
l1.remove(3);//remove
System.out.println(l1);
l1.add(3,56);
ArrayList l2=new ArrayList();
l2.add(0,12);
l2.add(1,23);
l2.add(2,34);
l2.add(3,45);
System.out.println();
System.out.println(l1.lastIndexOf(l2));
//last index of
System.out.println(l1.get(3));//get index

ArrayList l3=new ArrayList();
l3.add(0,12);
l3.add(1,23);
l3.add(2,34);
l3.add(3,45);
System.out.println(l3.addAll(l1));//add all
System.out.println(l3);
System.out.println(l3.set(3, 99));//set()
System.out.println(l3);
System.out.println(l3.subList(1,3));//sublist



		
		

	}

}
