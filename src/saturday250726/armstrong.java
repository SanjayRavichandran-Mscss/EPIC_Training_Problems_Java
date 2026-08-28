package saturday250726;
import java.util.Scanner;
public class armstrong {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.print("Enter Number : ");
	int n = Sc.nextInt();
	
	int temp = n;
	int sum = 0;
	int digitCount= 0;
	
	while(temp !=0) {
		digitCount++;
		temp = temp/10;
	}
	
	temp = n;
	
	while(temp!=0) {
		int lastdigit = temp%10;
		int power =1;
		for(int i =0; i <digitCount;i++) {
			power = power * lastdigit;
		}
		sum = sum+power;
		temp = temp/10;
		
	}
	
	 
	 if(sum == n) {
		 System.out.print("Armstrong");
	 }else {
		 System.out.print("Not Armstrong");
	 }
	 
	 Sc.close();
}
}
