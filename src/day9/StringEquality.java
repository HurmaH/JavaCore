package day9;

import java.util.Scanner;

public class StringEquality {
	public static void main(String[] args) {
		
	String name1 = "Hurmik";
	String name2 = "Hurmik";
	
	boolean b1 = name1=="Hurmik";        //true
	boolean b2 = name1 ==name2;          //false
	boolean b3 = name1.equals(name2);    //true
	boolean b4 = name1.equals ("Mishka");//false
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter name3:");
	String name3=scan.nextLine();
	if (name1.equals(name3)) {
		System.out.println("That is my name :)");
	}else {
		System.out.println("That is not my name :(");
	}
	
	scan.close();
	}
}
