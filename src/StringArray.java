import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		
		 // create an string array of capacity 4
	    // put your favorite movie/show in

	    // 1,first use loop to print them out

	    // 2, print the length of all items

	    // 3 , get the max length movie title
		
		//1.
	    String movies[] = new String[4];
	    movies[0] = "Life";
	    movies[1] = "without";
	    movies[2] = "love is";
	    movies[3] = "meaningless";
	    
	    System.out.println( Arrays.toString(movies)  );
	    
	    //2.
	    // getting the count of array 
	    // we are using length property of array object  
	    System.out.println( movies.length     );// notice this without the parenthesis

	    //System.out.println( movies[i].length());// notice this with parenthesis
	    for (int i = 0; i <= movies.length-1 ; i++) {
	      System.out.println( movies[i] + " char count is :  "+movies[i].length() ); 
	    }
	    
	    //3. get the location of word with max length
	    int max = movies[0].length(); 
	    //then just use that idx to get the word
	    int index=0;
	    /* max = 4
	     * Iteration 1 : 7 > 4 ---> max = 7  index = 1  
	     * Iteration 2 : 7 > 7 ---> max = staySame  index = 1  
	     * Iteration 3 : 11 > 7 ---> max = 11  index = 3  
	     * 
	     */
	    
	    for (int i = 1; i < movies.length; i++) {
	      
	      if( movies[i].length() > max ) {
	        max = movies[i].length() ; 
	        index=i;
	      }
	      
	    }
	    System.out.print(index+" is of the word location "
	            + "that has the max length: "+ movies[index]);
	    
	}

}
