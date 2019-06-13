package day21_ForLoop;

import java.util.Scanner;

public class WarmIp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int count=0;
		int n1, n2, sum;
		
		do {
			
		if (count==3) {
			System.out.println("You lost");
			break;
		}
		System.out.println("Enter two numbers:");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		sum = n1+n2;
		count++;
		
		}while (!(sum>100));
		
		System.out.println("THE END");
	}

}
