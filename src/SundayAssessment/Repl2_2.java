package SundayAssessment;

public class Repl2_2 {
	  public static void main(String[] args) {
		    //WRITE YOUR CODE HERE
//			  Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:
//				  zz
//				  zy
//				  zx
//				  zw
//				  zv
//				  yz
//				  ....
//				  vv
		  for (char c='z'; c>='v'; c--) {
			  for (char d='z'; d>='v'; d--) {
				  System.out.println(c+""+d); 
			  }
		  }
		  
		    
	}


}
