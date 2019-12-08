
public class InstanceBlock {
	int maximum;
	static int PI;
	InstanceBlock(){
		System.out.println("Constructor is created");
	}
	{
		System.out.println("block is executed");
		this.maximum=78;
		
	}
	InstanceBlock(int a){
		System.out.println("Constructor is overloaded");
	}
	static {
		System.out.println("ststic blockis executed");
		PI=3;
	}

}
