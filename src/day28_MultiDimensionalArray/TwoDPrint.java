package day28_MultiDimensionalArray;

import java.util.Arrays;

public class TwoDPrint {
	public static void main(String[] args) {
    /*
     * 2 dimensional array can be visualized as excel sheet 
     *   which has rows and columns
     *  first dimension size of 2d array can be seen as row count 
     * second dimension size of 2d array can be seen as column count
     * 
     * 12 17 3 40 44 27 23 12
     */
    int[][] table = new int[4][2];
    table[0][0] = 12;
    table[0][1] = 17;
    table[1][0] = 3;
    table[1][1] = 40;
    table[2][0] = 44;
    table[2][1] = 27;
    table[3][0] = 23;
    table[3][1] = 12;
    
    //printing each cell
    for (int [] row : table) {
    	for (int cell : row) {
    		System.out.print(cell+" ");
    	}
    	System.out.println();
    }
    
    //
    for (int i=0; i<table.length; i++) {
    	int [] eachRow = table[i];
//    	System.out.println(Arrays.toString(eachRow));
    	for (int j=0; j<eachRow.length; j++) {
    		System.out.print(eachRow[j]+" ");
    	}
    	System.out.println();
    }
	
    
	
	}
	

}
