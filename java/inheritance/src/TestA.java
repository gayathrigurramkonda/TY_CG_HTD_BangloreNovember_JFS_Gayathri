
public class TestA {

	public static void main(String[] args) {
		FirstGeneration fg=new FirstGeneration();
		fg.call();
		fg.msg();
		SecondGeneration sg=new SecondGeneration();
		sg.call();
		sg.msg();
		sg.radio();
		ThirdGeneration tg=new ThirdGeneration();
		tg.call();
		tg.msg();
		tg.radio();
		tg.camera();
		SecondGeneration sg1 =new ThirdGeneration();
		sg1.call();
		sg1.msg();
		sg1.radio();
		FirstGeneration fg1=new SecondGeneration();
		fg1.call();
		fg1.msg();
	

	}

}
