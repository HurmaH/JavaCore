package day28_MultiDimensionalArray;

public class ExcelVisual {
	public static void main(String[] args) {
		
		int [] [] data ={{2,14,3}, {4,5}, {9,7}};  
		  	  
		  for (int i=0; i<data.length; i++) {
			  if (i==1) {
				  continue;
			  }
			  for (int j=0; j<data[i].length; j++) {
				  System.out.println("data["+i+"]["+j+"] ="+data[i][j]);
			  }
		  }
		  
		  //skip 2nd row
		  for (int i=0; i<data.length; i++) {
			  if (i==1) {  continue;  }
			  for (int j=0; j<data[i].length; j++) {
				  System.out.println("data["+i+"]["+j+"] ="+data[i][j]);
			  }
		  }
		  
		//get only first row
		  for (int i=0; i<data.length; i++) {
			  if (i==1) {  break;  }
			  for (int j=0; j<data[i].length; j++) {
				  System.out.println("data["+i+"]["+j+"] ="+data[i][j]);
			  }
		  }
		  
		  //
		//skip if the value is equal to 4
		  for (int i=0; i<data.length; i++) {
			  for (int j=0; j<data[i].length; j++) {
				  if (data[i][j]==4) {continue;}
				  System.out.println("data["+i+"]["+j+"] ="+data[i][j]);
			  }
		  }
		  
		  
	}

}
