package day31_MethodsReturn;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnIntro {
	public static void main(String[] args) {
		
		String str = "Life is beautiful";
		
		int count = str.length();
		System.out.println(count);
		String arrStr = Arrays.toString(str.toCharArray());
		
		int five = giveMeFive();
		System.out.println(five);
		System.out.println(giveMeFive());
		
		System.out.println(giveMeYourName());
		
	}
  //public static void
	public static int giveMeFive() {
		return 5;
	}
	
	public static String giveMeYourName() {
		System.out.println("Name Please:");
		Scanner scan = new Scanner (System.in);
		return scan.next();
	}
	
	

}
