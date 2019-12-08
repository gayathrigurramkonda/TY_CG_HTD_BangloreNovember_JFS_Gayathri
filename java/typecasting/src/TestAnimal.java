
public class TestAnimal {
	public static void main(String[]args) {
		Animal a1=new Animal();
		Dog d1=new Dog();
		Lion l1=new Lion();
		Animal a2=new Dog();
		a2.eat();
		Animal a3=new Lion();
		a3.eat();
		
		Dog d2=(Dog)a2;
		d2.eat();
		d2.run();
		
		
	}

}
