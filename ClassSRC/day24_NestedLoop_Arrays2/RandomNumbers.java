package day24_NestedLoop_Arrays2;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		
		Random rand = new Random ();
		int i = rand.nextInt(100);
		System.out.println(i);
		
		int num [] = new int [10];
		
		for (int j=0; j<10; j++) {
			//0-100
			num[j] = rand.nextInt(100);   //0-100
		}
		System.out.println(Arrays.toString(num));
	}

}
