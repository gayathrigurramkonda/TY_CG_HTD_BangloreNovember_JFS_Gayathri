package checkedexception;

public class ExceptionC {

	public static void main(String[] args) {
	System.out.println("main started");
	Employee e1=new Employee();
	try {
		Object o1=e1.clone();
		System.out.println("clone is found");
		try {
			Class c1=Class.forName("Employee");
		}catch(ClassNotFoundException e){
			System.out.println("class is not found");
			
		}
	} 
	catch (CloneNotSupportedException e) {
		System.out.println("clone is not found");
	}
	System.out.println("main ended");

	}

}
