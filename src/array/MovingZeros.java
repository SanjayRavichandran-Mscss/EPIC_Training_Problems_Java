package array;

import java.util.Scanner;

public class MovingZeros {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	       System.out.println("Array Elements :");
	       for (int i = 0; i < n; i++) {
	    	   System.out.print(arr[i] + " ");
	       }
	       
	       
	       int j = 0;
	       for(int i = 0;i<n;i++) {
	    	   if(arr[i] !=0) {
	    		   int temp = arr[i];
	    		   arr[i] = arr[j];
	    		   arr[j] = temp;
	    		   j++;
	    	   }
	       }
	       
	       System.out.println();
	       System.out.println("After Moving zeros:");
	       for(int i =0;i<n;i++) {
	    	   System.out.print(arr[i] + " ");
	       }
	        sc.close();
	    }
}
