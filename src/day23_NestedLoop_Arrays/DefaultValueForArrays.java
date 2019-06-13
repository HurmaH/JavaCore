package day23_NestedLoop_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DefaultValueForArrays {
	public static void main(String[] args) {
		//1. int default=0
		int [] nums = new int [3];
		nums [1]=100;
		
		//2.boolean default = false
		boolean [] bools = new boolean [4];
		System.out.println(Arrays.toString(bools));
		
		//3.char default = ' ' = empty char = Ascii value is 
		char [] chars = new char [4];
		System.out.println(Arrays.toString(chars));
		
		//4.short = 0
		short [] shorts = new short [2];
		System.out.println(Arrays.toString(shorts));
		
		//5. int = 0;
		int [] ints = new int [3];
		System.out.println(Arrays.toString(ints));
		
		//6. long = 0
		long [] longs = new long [3];
		System.out.println(Arrays.toString(longs));
		//longs [0]=null; /--> type mismatch
		
		//7. float =0 
		float [] floats = new float [3];
		System.out.println(Arrays.toString(floats));
		
		//8. double = 0.0
		double [] doubls = new double [3];
		System.out.println(Arrays.toString(doubls));
		
		//9. Scanner --> defaul=null, anything that is not primitive will give null
		Scanner [] scans = new Scanner [3];
		System.out.println(Arrays.toString(scans));
		
		//10.string = null
		String [] str = new String [3];
		System.out.println(Arrays.toString(str));
		
	}

}
