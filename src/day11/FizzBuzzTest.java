package day11;

import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String[] args) {
//		
//		ask user for a int 
//		here is your condition 
//		if the number is divisible by 5  print fizz
//		if the number is divisible by 3 print buzz
//		if both are true print fizz buzz
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter int number: ");
		int num = scan.nextInt();
		
		if (num%3==0 && num%5==0) {
			System.out.println("FIZZ BUZZ");
		}else if (num%5==0) {
			System.out.println("FIZZ");
		}else if (num%3 == 0) {
			System.out.println("BUZZ");
		}else {
			System.out.println("It is not FIZZ BUZZ number");
		}
		
		scan.close();
	}

}
