class Circle{
	 static double areaCircle(int r){
 	double areaCircle=3.14*r*r;
	return areaCircle;
	}
	static double perimeterCircle(int r){
	double perimeterCircle=3.14*2*r;
	return perimeterCircle;
	}
	public static void main(String args[]){
	double res=areaCircle(4);
	System.out.println("area is"+res);
	double res1=perimeterCircle(5);
	System.out.println("perimeter is"+res1);
	}

}