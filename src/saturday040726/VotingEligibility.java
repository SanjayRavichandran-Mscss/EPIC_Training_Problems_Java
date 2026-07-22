package saturday040726;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age:");
        int Age = sc.nextInt();
        if(Age >= 18) {
        	System.out.println("You are eligible for Vote!");
        }else {
        	System.out.print("You are Not eligible for Vote");
        }
	}
}
