package day10;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Welcome to Cybertek Banking App");
		
		long accountNumber =12345L;
		String userPassword = "abc123";
		
		System.out.println("Enter Your account number: ");
		long account = in.nextLong();
		
		in.close();
		
	}

}
