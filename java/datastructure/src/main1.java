import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class main1 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter size of array");
		
		int length = scn.nextInt();
	      int [] Array = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         Array[i] = scn.nextInt();
	         
	      }
	      System.out.println("bubble sort is");
	      BubbleSort.bubbleSort(Array);
	      System.out.println(Arrays.toString(Array));
	      System.out.println("insertion sort is");
	      Insertionsort.sort(Array);
	      System.out.println(Arrays.toString(Array));
	      }
	  
	
}
