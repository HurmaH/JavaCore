package day26;

import java.util.Arrays;

public class StringSplit {
	
	public static void main(String[] args) {
		

	    String shows = "Orville, Game Of Throne, X-man ,Gifted, Breaking bad" ; 
	    
	    String[] showsArray = shows.split(",") ; 
	    System.out.println(Arrays.toString(showsArray));
//	    for (int i = 0; i < showsArray.length; i++) {
//	      System.out.println(showsArray[i]);
//	    }
	    System.out.println(  showsArray[1] );
	    
	    System.out.println(  showsArray[  showsArray.length-1 ]      );
	    
	    String[] showsArray2 = shows.split("Game Of Throne") ; 
	    
	    for (int i = 0; i < showsArray2.length; i++) {
	      
	      System.out.println(showsArray2[i]);
	      
	    }
	}

}
