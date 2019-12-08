import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class TestA {
	public static void main(String[] args) {
		System.out.println("------------predicate");
		Predicate<Integer> p=i->i%2==0;
		boolean b1=p.test(12);
		System.out.println(b1);
		System.out.println(p.test(53));
		System.out.println("------------function");
		Function<Integer,Integer> f1=i->i*100;
		int a=f1.apply(89);
		System.out.println(a);
		System.out.println("---------------supplier");
		Supplier<Person> s1=()->new Person(22,"mouni");
		System.out.println(s1.get().getAge());
		System.out.println(s1.get().getName());
		System.out.println("----------------------consumer");
		Consumer<Person> c1=j ->{
			System.out.println(j.getAge());
			System.out.println(j.getName());
		};
		Person p1=new Person(22,"mouni");
		c1.accept(p1);
	}

}
