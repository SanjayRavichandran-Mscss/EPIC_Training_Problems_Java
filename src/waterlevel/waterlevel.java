package waterlevel;
import java.util.Scanner;
public class waterlevel {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size: ");
			int n = sc.nextInt();
			
			int[] height = new int[n];
			
			System.out.println("Enter the height of the building: ");
			for(int i = 0; i<n; i++) {
				height[i] = sc.nextInt();
			}
			
			int water = 0;
			
			for(int i = 0; i<n; i++) {
				int leftMax = height[i];
				int rightMax = height[i];
				
				for(int j = 0; j<i; j++) {
					if(height[j] > leftMax) {
						leftMax = height[j];
					}
				}
				
				for(int j = i+1; j<n; j++) {		
					if(height[j] > rightMax) {
						rightMax = height[j];
					}
				}
				
				int min;
				
				if(leftMax < rightMax) {
					min = leftMax;
				}else {
					min = rightMax;
				}
				
				water = water +(min-height[i]);
			}
			
			System.out.println("Water Trapped: "+water);
		}
	}

