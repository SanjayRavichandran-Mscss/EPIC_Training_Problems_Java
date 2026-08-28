package array;

import java.util.Scanner;

public class RemoveDuplicateFromUnsortedArrayWithTwoPointer {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];

		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
		int k = 0;
		
	for(int i = 0;i<n;i++) {
		boolean found = false;
		
		for(int j = 0;j<k;j++) {
			if (arr[i]==arr[j] ){
				found = true;
				break;
			}
		}
		if(!found) {
			arr[k]=arr[i];
			k++;
		}
		
		
	}
	
	System.out.print("Unique Elements:");
	for(int i =0;i<k;i++) {
		System.out.print(arr[i]+" ");
	}
	
		
		Sc.close();
	}
}
