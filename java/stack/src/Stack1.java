import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(23);
		s1.addElement(67);
		s1.push(12);
		System.out.println(s1);
		System.out.println();
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());//get method
		System.out.println(s1);
		s1.push(22);
		System.out.println(s1.search(67));//gives position fromlast
		
		System.out.println(s1);
		///23 67 22 here 22 is 1 and 67 is 2 23 is 3
	}

}
