package array;

import java.util.Scanner;

public class AddingMatrix {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Rows :");
		int rows = Sc.nextInt();

		System.out.print("Enter columns :");
		int columns = Sc.nextInt();

		int arr1[][] = new int[rows][columns];
		int arr2[][] = new int[rows][columns];
		int add[][] = new int[rows][columns];

		System.out.print("Enter Elements for Array 1 : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr1[i][j] = Sc.nextInt();

			}
		}


		System.out.print("Enter Elements for Array 2 : ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr2[i][j] = Sc.nextInt();

			}
		}


		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				add[i][j] = arr1[i][j] + arr2[i][j];

			}

		}
		System.out.print("Matrix 1 : \n");
		for(int i = 0  ; i < rows ; i++) {
			for(int j = 0; j<columns;j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Matrix 2 : \n");
		for(int i = 0  ; i < rows ; i++) {
			for(int j = 0; j<columns;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();

		}

		
		
		System.out.print("Addition of Two matrix : \n");

		for(int i =0 ; i < rows ; i++) {
			for(int j = 0; j<columns ; j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}

		Sc.close();
	}

}
