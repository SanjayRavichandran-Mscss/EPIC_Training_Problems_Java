package array;

import java.util.Scanner;

public class CountPositiveNegativeZero {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Array length :");
		int n = Sc.nextInt();
		
		System.out.print("Enter Array Elements :");
		int arr[] = new int[n];
		
		
		for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();	
		}
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i]<0) {
				negative++;
			}else if(arr[i]>0){
				positive++;
			}else {
				zero++;
			}
		
			

		}
		System.out.print("Positive : "+positive+"\n");
		System.out.print("Negative : "+negative+"\n");
		System.out.print("Zero : "+zero+"\n");
		
		
		
		
		Sc.close();
	}
}
