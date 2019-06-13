package day20_DoWhile;

import java.util.Scanner;

public class Reveiw {
	public static void main(String[] args) {
		
		/*
	     * while( some condition is true){
	     *     action to be repeated
	     * }
	     * 
	     * do{
	     *     action to be repeated
	     * }while(some condition is true); 
	     * 
	     * */
		
		Scanner scan = new Scanner (System.in);
		String name = "";
		String pass = "";
		
		do {
			System.out.println("Enter name:");
			name = scan.next();
			System.out.println("Enter password:");
			pass = scan.next();
			
		} while (!(name.equals("abc") && pass.equals("123")));
		
		System.out.println("Valid credentials!");
			
		
//		
//		
//		while (!(name.equals("abc") && pass.equals("123"))) {
//			System.out.println("Enter name:");
//			name = scan.next();
//			System.out.println("Enter password:");
//			pass = scan.next();
//		}
		
		
	}

}
