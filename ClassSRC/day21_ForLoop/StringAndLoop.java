package day21_ForLoop;

import java.util.Scanner;

public class StringAndLoop {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//1.
		System.out.println("Please enter Your name:");
		String name = scan.next();
		
		for (int i=0; i<name.length(); i++ ) {
			System.out.print(name.charAt(i)+"");
		}
		System.out.println();
		//2.
		String reverse="";
		for (int i=name.length()-1; i>=0; i-- ) {
			reverse +=name.charAt(i)+"";
		}
		System.out.println(reverse);
		
	}

}
