package waterlevel;

import java.util.Scanner;

public class waterleveloptimized {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		int[] height = new int[n];
		
		System.out.println("Enter the height of the building: ");
		for(int i = 0; i<n; i++) {
			height[i] = sc.nextInt();
		}
		
	
		
	}
}
