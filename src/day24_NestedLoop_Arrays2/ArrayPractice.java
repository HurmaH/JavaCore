package day24_NestedLoop_Arrays2;

import java.util.Arrays;

public class ArrayPractice {
	public static void main(String[] args) {
		
		String names [] = {"Hurma", "Mekan", "Sofiya", "Maya", "Kerim"};
		System.out.println(names[2]);
		
		System.out.println(names[3]);
		
		System.out.println( names[names.length-1]    );
	    System.out.println( names[4]    );
		
		names [3]="Mishka";
		System.out.println(names[3]);
		
		System.out.println(Arrays.toString(names));
	}

}
