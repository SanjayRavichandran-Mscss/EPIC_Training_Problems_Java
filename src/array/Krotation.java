package array;
import java.util.Scanner;
public class Krotation {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	
	System.out.print("Enter the Array Size :");
	int n  = Sc.nextInt();
	
	int arr[] = new int[n];
	
	System.out.print("Enter Array Elements :");
	for(int i = 0; i<n;i++) {
		arr[i] = Sc.nextInt();
	}
	
	System.out.print("Enter the Rotation :");
	int k = Sc.nextInt();
	
	k = k%n;
	
	for(int r = 1; r<=k;r++) {
		int first = arr[0];
		
		for(int i =0;i<=k;i++) {
			arr[i] = arr[i+1];
		}
		
		arr[n-1] = first;
	}
	
	
	for(int i = 0;i<n;i++) {
		System.out.print(arr[i] + " ");
	}
	
	
	
	
	
	Sc.close();
}
	
}
