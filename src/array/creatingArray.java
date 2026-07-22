package array;

import java.util.Scanner;

public class creatingArray {
    public static void main(String[] args) {
    	Scanner Sc = new Scanner(System.in);
    	
System.out.print("Enter rows : ");
int rows = Sc.nextInt();

System.out.print("Enter Columns : ");
int columns = Sc.nextInt();

int arr[][] = new int[rows][columns];

System.out.print("Enter Elements :");
for(int i = 0 ; i <rows ; i++) {
	for(int j = 0 ; j< columns ; j++) {
		arr[i][j] = Sc.nextInt();
	}
}


System.out.print("2D Array Elements : \n");
for(int i = 0 ; i < rows ; i++) {
	for(int j = 0 ; j < columns ; j++) {
		System.out.print(arr[i][j]+ " ");
	}
	System.out.println();
}
     
        Sc.close();
    }
}