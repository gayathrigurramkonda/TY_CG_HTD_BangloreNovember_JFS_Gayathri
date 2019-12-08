
public class Son extends Father {
	Son(){
		super("john",45);
		System.out.println("c");
	}
	Son(String name,int age){
		this();
		System.out.println("d");
	};
	

}
