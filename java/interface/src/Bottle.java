
public interface Bottle {
	void open();
	void drink();
	default void juice() {
		System.out.println("juice");
	}
	static void close() {
		System.out.println("close");
	}
	
		

}
