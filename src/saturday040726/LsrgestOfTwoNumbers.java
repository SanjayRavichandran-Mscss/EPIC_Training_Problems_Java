package saturday040726;
import java.util.Scanner;
public class LsrgestOfTwoNumbers {
	
	
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter First Number: ");
int num1 = sc.nextInt();

System.out.print("Enter Second Number");
int num2 = sc.nextInt();

if (num1==num2) {
	System.out.print("Both are Equal");
}
else if(num1>num2) {
	System.out.print(num1+"is a Largest");
}else {
	System.out.print("num2 is Largest");
}
sc.close();
}
}