package oops;

public class TestQspiders {

	public static void main(String[] args) {
		Qspiders OAR=new Qspiders();
		OAR.swipe();
		OAR.swipe();
		Qspiders BTM=new Qspiders();
		BTM.swipe();
		BTM.swipe();
		System.out.println(OAR.branchcount);
		System.out.println(BTM.branchcount);
		System.out.println(Qspiders.totalcount);
		

	}

}
