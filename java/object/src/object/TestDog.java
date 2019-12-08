package object;

public class TestDog {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Dog d1=new Dog("sony");
		Class c1=d1.getClass();      //new object is created using zero parameterised constructor
		Dog d2=(Dog) c1.newInstance();
		System.out.println(c1);
		System.out.println(d2.name);
		Class c2=Class.forName("Dog");
		System.out.println(c2);
		Dog d3=(Dog) c2.newInstance();
		System.out.println(c2);///create default package thn only for,name works
		
		

	}

}
