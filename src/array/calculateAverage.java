package array;

import java.util.Scanner;

public class calculateAverage {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];
		
		
		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
		int sum =0 ;
		System.out.print("Average of Array Elements :");
		for(int i = 0; i < n ; i++) {
			sum+=arr[i];
		}
		int average = sum/n;
		System.out.print(average);
		Sc.close();
	}
}
