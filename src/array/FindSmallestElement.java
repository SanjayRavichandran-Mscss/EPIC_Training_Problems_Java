package array;

import java.util.Scanner;

public class FindSmallestElement {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];
		
		
		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
		int smallest = arr[0];
		
		System.out.print("Array Elements :");
		for(int i = 1; i < n ; i++) {
			if(arr[i]<smallest) {  
				smallest = arr[i];
			}
		}
		System.out.print(smallest);
		Sc.close();
	}
}
