package day28_MultiDimensionalArray;

import java.util.Arrays;

public class TwoDArrayCreating {
	public static void main(String[] args) {
		
		/*
		 * 2D array can be visualized as excel sheet
		 * which has rows and columns
		 * first dimension size of 2D array can be seen as row count
		 * second dimension size of 
		 * 
		 */
		
		//1.
		int[][] data=new int[4][2];
		data[0][0]=12;
		data[0][1]=17;
		data[1][0]=3;
		data[1][1]=40;
		data[2][0]=44;
		data[2][1]=27;
		data[3][0]=23;
		data[3][1]=12;
		
		//2 way
		int [] [] data2 = new int [4][2];
		data2 [0] = new int [] {13,17};
		data2 [1] = new int [] {3,40};
		data2 [2] = new int [] {44,27};
		data2 [3] = new int [] {23,12};
		
			    
	    // 2 dimesional array is an array object that store 
	    // 1 dimensional array in each slot 
	    
	    int[][] numsOfnums = new int[2][] ;
	    int[] nums1 = new int[] {1,3,5} ; 
	    int[] nums2 = new int[] {1,13} ;
	    
	    // length method on an array will always return first dimension length
	    System.out.println( numsOfnums.length );
	    
	    numsOfnums[0] = nums1 ; 
	    numsOfnums[1] = nums2 ; 
	    
	    for (int i = 0; i < numsOfnums.length; i++) {
	      System.out.println( Arrays.toString(numsOfnums[i])  );
	      System.out.println( numsOfnums[i].length  );
	    }
	    
	    for( int[] eachRow :  numsOfnums ) {
	      for( int eachCell : eachRow) {
	        System.out.print( eachCell + " " );
	      }
	    }
	    
	  //3 way
	  int [] [] data3 ={{2,14,3}, {4,5}, {9,7}};  
	  for (int [] row : data3) {
		  for (int num: row) {
			  System.out.print(num+" ");
		  }
		  System.out.println();
	  }
	  
	  for (int i=0; i<data3.length; i++) {
		  System.out.println("Row Number "+(i+1)+ " : ");
		  for (int j=0; j<data[i].length; j++) {
			  System.out.print(data[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
			
		
	}

}
