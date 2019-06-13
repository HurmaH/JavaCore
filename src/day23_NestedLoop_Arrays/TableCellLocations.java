package day23_NestedLoop_Arrays;

public class TableCellLocations {
	public static void main(String[] args) {
			
	/*
	 * create a program to print out
	 * each location of cell in this format
	 * 
	 * table 2 column and 2 row
	 * cell(1,1) cell (1,2)
	 * cell(2,1) cell (2,2)
	 */
	// given you have 3 row and 4 column
	
	for (int row=1; row<=3; row++) { //outer loop - row
		for (int column=1; column<=4; column++) { //inner loop - column
			System.out.println("Cell("+row+","+column+") ");
		}
	}
	
	
	//outer loop - row iteration
	for (int i=1; i<=3; i++) {
		System.out.println();
		System.out.print("Row : "+i+"-->"); 
		for (int j=1; j<=4; j++) {
			System.out.print(" Column : "+j+", " );
		}
	}
	
}

}
