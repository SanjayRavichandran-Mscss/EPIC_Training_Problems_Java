package saturday040726;

import java.util.Scanner;

public class straightLinestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stars: ");
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}