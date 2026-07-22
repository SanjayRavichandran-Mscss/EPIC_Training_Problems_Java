package saturday040726;
import java.util.Scanner;


public class LeftTriangle {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.print("Enter n:");
	int n = Sc.nextInt();
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	Sc.close();
}
}
