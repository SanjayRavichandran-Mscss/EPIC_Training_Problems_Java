package array;

import java.util.Scanner;

public class ReverseArryUsingTwoPointer {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
		 System.out.print("Original Array :");

	     for (int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	     }		
		 System.out.println();

		

		
		int left = 0;
		int right = n-1;
		
	while(left<right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}
	 System.out.println("Reversed Array: \n");

     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }		
   

	

		Sc.close();
	
}}
