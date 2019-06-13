package day16_MoreStringMethods;

import java.util.Scanner;

public class StringEquality {
	
	public static void main(String[] args) {
		//String pool is a special location inside heap
		//to store unique string literal
		//SCP == STRING CONSTANT POOL --->>> String Pool
		
		Scanner scan = new Scanner (System.in);
		String s = scan.nextLine();//
		String s1 = "abc";             //String literal
		String s2 = new String ("abc");//new object
		String s3 = "abc";
		String s4 = new String ("abc");
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s3==s2);//false
		System.out.println(s2==s4);//false
		System.out.println(s==s1); //false
	}

}
