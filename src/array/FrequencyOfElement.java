package array;
import java.util.Scanner;

public class FrequencyOfElement {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter The Size :");
	int n = Sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter the Array Elements :");
	
	for(int i = 0;i<n;i++) {
		arr[i] = Sc.nextInt();
	}
	System.out.println("Frequency of Each Element :");
	for(int i = 0;i<n;i++) {
		boolean alreadyCounted = false;
		
		for(int j = 0;j<i;j++) {
			if(arr[i]==arr[j]) {
				alreadyCounted = true;
				break;
			}
		}
		
		if(alreadyCounted) {
			continue;
		}
		
		int count = 0;
		for(int j = 0;j<n;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		
		System.out.println(arr[i]+"->"+count);
	}
	Sc.close();
}
}
