package day20_DoWhile;

import java.util.Scanner;

public class LoopPractice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String name = scan.next();
		
		name = name.substring(0, 1).toUpperCase()+name.substring(1);
		System.out.println(name);
		
		//Task1
		//print name char by char with space
		
		int num= 0;
		
		do {
			System.out.print(name.charAt(num)+" ");
			num++;
		} while (num <name.length());
	
	}

}
