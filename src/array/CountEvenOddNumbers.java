package array;

import java.util.Scanner;

public class CountEvenOddNumbers {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];
		
		
		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
		int even_count =0 ;
		int odd_count = 0;
		for(int i = 0; i < n ; i++) {
		if(arr[i]%2==0) {
			even_count++;
		}else {
			odd_count++;
		}
		}
		System.out.print("Even Count: "+even_count +"\n");
		System.out.print("Odd Count: "+odd_count);

		Sc.close();
	}
}
