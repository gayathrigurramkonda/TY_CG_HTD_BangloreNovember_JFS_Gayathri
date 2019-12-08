
public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize");
		
		
	}

}//here extends object cls it is by default finalize method is present 
