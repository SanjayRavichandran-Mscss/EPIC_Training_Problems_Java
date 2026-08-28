package array;

import java.util.Scanner;

public class longestSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int j = 0;
        int sum = 0;
        int maxLength = 0;

        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            while (sum > k && j <= i) {
                sum -= arr[j];
                j++;
            }

            if (sum == k) {

                int length = i - j + 1;

                if (length > maxLength) {
                    maxLength = length;
                    start = j;
                    end = i;
                }
            }
        }

        if (start != -1) {

            System.out.println("Longest Subarray Length : " + maxLength);

            System.out.print("Longest Subarray : ");

            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("No subarray found.");
        }

        sc.close();
    }
}