package array;
import java.util.Scanner;
public class Krotationright {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Rotation: ");
        int k = sc.nextInt();

        k = k % n;

        for (int r = 0; r < k; r++) {

            int last = arr[n - 1];

            for (int i = n - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        System.out.println("After Rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
