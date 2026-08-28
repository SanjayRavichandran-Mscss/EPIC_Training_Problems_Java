package array;

import java.util.Scanner;

public class RemoveDuplicatePrintOneOccurences {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];

		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
	for(int i = 0; i<n;i++) {
		int count = 0;
		for(int j = 0; j<n;j++) {
			if(arr[i] == arr[j]) {
			count++;
			}
		}
		if(count ==1) {
			System.out.print(arr[i]+" ");
		}
	}
		
		Sc.close();
	}
}
