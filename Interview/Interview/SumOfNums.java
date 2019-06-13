package Interview;

import java.util.Scanner;

public class SumOfNums {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter number:");
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i=0; i<=num; i++) {
			sum += i;
		}
		
		System.out.println("Sum of numbers from 1 to "+num+" is "+sum);
	}

}
