package array;
import java.util.Scanner;
public class FindDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        boolean found = false;

        System.out.print("\nDuplicate Elements: ");

        for (int i = 0; i < n; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check for duplicate after index i
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break; // Print only once
                }
            }
        }

        if (!found) {
            System.out.print("No Duplicate Elements");
        }

        sc.close();
    }
}
