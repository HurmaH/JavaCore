package Interview;

import java.util.Scanner;

public class OccuranceOfWordCharInSTR {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a string:");
		String str = scan.nextLine();
		
		System.out.println("Enter certain char or word to find occurance:");
		String target = scan.nextLine();
		
		int targetLen = target.length();
		
		
		for(int i=0; i<=str.length()-targetLen; i++) {
			if (str.substring(i, i+targetLen).equals(target)) {
				System.out.println(i);
			}
		}
		
	}
}
		
		