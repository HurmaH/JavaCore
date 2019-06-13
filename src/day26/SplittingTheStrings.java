package day26;

import java.util.Arrays;

public class SplittingTheStrings {
	public static void main(String[] args) {
		
		String str = "Java is fun";
		
		String [] strToArr = str.split(" ");
		System.out.println(Arrays.toString(strToArr));
		
		String [] parts = str.split("a");
		System.out.println(Arrays.toString(parts));
		
		String [] parts2 = str.split("is");
		System.out.println(Arrays.toString(parts2));
		
	}

}
