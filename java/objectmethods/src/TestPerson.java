
public class TestPerson {
	public static void main(String []args) throws Throwable {
		System.out.println("----main starts---");
		Person p1=new Person("pinky");
		p1.finalize();
		p1=null;
		System.gc();
		System.out.println("----------main ends-----");
	}

}
//it indirectly extends person class so no finalize method as it is protected
//if we dont override finalize method also garbage collector works 