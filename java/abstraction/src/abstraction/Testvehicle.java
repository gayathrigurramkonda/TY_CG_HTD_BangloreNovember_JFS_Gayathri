package abstraction;

public class Testvehicle {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.start(4,5);
		c1.stop();
		System.out.println(";;;;;;;");
		Vehicle v1=new Car();
		v1.start(5,6);
		

	}

}
