package array;

import java.util.Scanner;

public class linearSearch {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];

		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
		
		System.out.print("Enter Search Element :");
		int search = Sc.nextInt();
		
		boolean found = false;
		for(int i = 0; i < n ; i++) {
		
			if(arr[i] == search) {
				System.out.print("The Searched element is fount ad index "+i);
				found = true;
				break;
			}
			
		}
		
		if(!found) {
			System.out.print("The Searched element not found");

		}
	
		
		Sc.close();
	}
}
