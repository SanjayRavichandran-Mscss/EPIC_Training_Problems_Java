package saturday040726;
import java.util.Scanner;

public class ReverseRightTriangle {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.print("Enter Number");
	int n = Sc.nextInt();
	for(int i=1;i<=n;i++) {   //row: we dont reduce the count of row
		for(int j=i;j<=n;j++) { // column: we should reduce the column for each iteration so , instead of j=1 , we should use j=i , so each iteration it starts with increase valule so automatically the column will reduce
			System.out.print("*");
		}
		System.out.println();

	}
	Sc.close();

}

}
