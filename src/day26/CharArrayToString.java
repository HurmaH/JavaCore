package day26;

import java.util.Arrays;

public class CharArrayToString {
	
	public static void main(String[] args) {
		
		String str1 = "Hayrulla Muattar";
		char [] nameChars = str1.toCharArray();
		System.out.println(Arrays.toString(nameChars));
		
		//1. creating string using loop
		String str2 = "";
		for (int i=0; i<nameChars.length; i++) {
			str2 += nameChars[i];
		}
		System.out.println(str2);
		
		//2. 
		String str3 = new String (nameChars);
		System.out.println(str3);
	}

}
