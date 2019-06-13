package day33_ReturnMethod;

import java.util.Arrays;


public class CombineArray {
	public static void main(String[] args) {
		
		double [] d1 = {1.3, 4.5, 3.99, 2.88};
		double [] d2 = {2.45, 7.8};
		
		System.out.println(Arrays.toString(combineArray(d1,d2)));
		
		double [] expected = {1.3, 4.5, 3.99, 2.88, 2.45, 7.8};
		
		if(Arrays.equals(combineArray(d1,d2),expected )) {
		      System.out.println("Test has passed ");
		    }else {
		      System.out.println("Test Failed");
		    }
		
	}
	
	public static double[] combineArray(double [] d1, double [] d2) {
		
		double[] newArr = new double [d1.length+d2.length];
		
		for (int i=0; i<d1.length; i++) {//i=0, i<4
			
			newArr[i]=d1[i];
		}
		
		for (int i=0; i<d2.length; i++) {
			newArr[d1.length+i] = d2[i];
		}
		
		return newArr;
	}
	
public static double[] combineArray2(double [] d1, double [] d2) {
		
		double [] combined=Arrays.copyOf(d1, d1.length+d2.length);
		int count=0;
		for (double num:d2) {
			combined[d1.length+count]=d2[count++];
		}
		return combined;
	}

}
