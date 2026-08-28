package saturday250726;

import java.util.Scanner;

public class FibonacciSeries {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Number: ");
	        int n = sc.nextInt();

	      int first = 0;
	      int second = 1;
	      for(int i = 0; i <n ; i++) {
	    	  int next = first +second;
		      System.out.print("Fibonacci : "+next);
		      first = second;
		     

	      }

	        sc.close();
	    }
}
