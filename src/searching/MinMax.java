package searching;

import java.util.Arrays;
import java.util.Scanner;

class Pair{
	public int min;
	public int max;
}

public class MinMax {
	
	//sorting and searching min max
	static Pair getMinMax(int arr[], int n) {
		
		Pair minmax = new Pair();
		Arrays.sort(arr);
		
		minmax.min = arr[0];
		
		minmax.max = arr[n-1];
		
		return minmax;
		
	}
	
	public static void main(String... args) {
		
		//taking user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size: ");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter an Array: ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		//closing Scanner
		sc.close();
		
		//calling method
		Pair minmax = getMinMax(arr, n);
		
		System.out.println("Minimum Element is: "+ minmax.min);
		System.out.println("Maximum Element is: "+ minmax.max);
		
	}

}
