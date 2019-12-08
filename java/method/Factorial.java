class Factorial{
	static int factorial(int num){
	if (num==0){
	return 1;
	}
	return num*factorial(num-1);
	}
	public static void main (String[]args)
	{
  	int value=factorial(15);
	System.out.println("value is"+value);

	}
}