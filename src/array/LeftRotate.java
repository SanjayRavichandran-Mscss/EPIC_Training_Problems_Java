package array;
import java.util.Scanner;
public class LeftRotate {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Array Size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.print("Enter Array Elements: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter Number of Rotations: ");
	        int k = sc.nextInt();

	        // Handle rotations greater than array size
	        k = k % n;

	        // Rotate k times
	        for (int r = 1; r <= k; r++) {

	            int first = arr[0];

	            for (int i = 0; i < n - 1; i++) {
	                arr[i] = arr[i + 1];
	            }

	            arr[n - 1] = first;
	        }

	        System.out.print("Array After Left Rotation: ");

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();
	    }
}
