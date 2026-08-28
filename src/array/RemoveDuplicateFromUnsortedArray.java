package array;

import java.util.Scanner;

public class RemoveDuplicateFromUnsortedArray {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];

		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
	for(int i = 0;i<n;i++) {
		boolean found = false;
		for(int j = 0;j<i;j++) {
			if (arr[i]==arr[j] ){
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.print(arr[i]+" ");		}
	}
	
		
		Sc.close();
	}
}
