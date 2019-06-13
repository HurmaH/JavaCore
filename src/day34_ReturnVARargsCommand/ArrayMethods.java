package day34_ReturnVARargsCommand;

import java.util.Arrays;

public class ArrayMethods {
	
	/*
     * Create static a method called
     *  
     *  getArrayFrom1toX
     *  it takes one parameter 
     *  and return array starting from 1 to the number specified
     *  
     *   getArrayFrom1toX(5) --> {1,2,3,4,5}
     */
	
	public static void main(String[] args) {
		
		int x=12;
		int [] num = getArrayfrom1tox (x);
		System.out.println(Arrays.toString(num));//long way of calling method
		
		System.out.println(Arrays.toString(getArrayfrom1tox (10)));//short way
	}
	
	public static int[] getArrayfrom1tox (int num) {
		
		int [] numArr = new int [num];
		
		for (int i=1; i<=num; i++) {
			numArr[i-1]=i;
		}
		return numArr;
	}

}
