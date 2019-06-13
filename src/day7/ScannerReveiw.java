package day7;

import java.util.Scanner;

public class ScannerReveiw {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Your name please:");
		String name = scan.nextLine();
		
		System.out.println("Enter Your company please:");
		String company = scan.nextLine();
		
		 System.out.println("Enter your age please : " );
		 int age = scan.nextInt(); 
		 
		 System.out.println("Hello Fellow Coder, your name is "+name 
							+ ", you work at "+company
							+", Your age is "+age);   
		 
		 byte b = scan.nextByte();
		 short s = scan.nextShort();
		 long l = scan.nextLong();
		 float f = scan.nextFloat();
		 double d = scan.nextDouble();
		 //char c = scan.nextChar(); NO CHAR !!!~ 
		 boolean isHungry = scan.nextBoolean();
		
		
	}

}
