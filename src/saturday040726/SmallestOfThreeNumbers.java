package saturday040726;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();

        if (num1 <= num2) {
            if (num1 <= num3) {
                System.out.println(num1 + " is the smallest number.");
            } else {
                System.out.println(num3 + " is the smallest number.");
            }
        } else {
            if (num2 <= num3) {
                System.out.println(num2 + " is the smallest number.");
            } else {
                System.out.println(num3 + " is the smallest number.");
            }
        }

        sc.close();
    }
}