package array;
import java.util.Scanner;
public class Read_print_array {
public static void main(String[] args) {
	
	Scanner Sc = new Scanner(System.in);
	
//	int arr[] = {1,2,3,434,5,3};
//	for(int i = 0;i <arr.length;i++) {
//	System.out.print(arr[i] + " ");
		
	System.out.print("Enter Array length :");
	int n = Sc.nextInt();
	
	System.out.print("Enter Array Elements :");
	int arr[] = new int[n];
	
	
	for(int i = 0;i<n;i++) {
	arr[i] = Sc.nextInt();	
	}
	
	System.out.print("Array Elements :");
	for(int i = 0; i < n ; i++) {
		System.out.print(arr[i]+" ");
	}
	
	Sc.close();
}
}
