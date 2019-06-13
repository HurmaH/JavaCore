package day23_NestedLoop_Arrays;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a string:");
		String str = scan.nextLine();
		String reversed = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i); 
		}
		
		System.out.println("Origin string: "+str);
		System.out.println("Reversed string: "+reversed);
	}

}
