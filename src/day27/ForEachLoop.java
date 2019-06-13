package day27;

public class ForEachLoop {
	public static void main(String[] args) {

	    int[] nums = {1,33,567,11,22} ; 
	    
	    for (int i = 0; i < nums.length; i++) {
	      
	      int eachItem = nums[i] ; 
	      System.out.println(eachItem);
	      
	    }
	    
	    // for each loop syntax 
	    /*
	     * for ( eachItemDataType variable name : collectionVariable ) {
	     *     your action in here
	     * }
	     * for each loop  or enhanced for loop  
	     * 
	     * for each loop can only be used for looping through collection type
	     * */
	    
	    for( int eachItem  : nums ) {
	      System.out.println(eachItem);
	    }
	    
	    /*
	     * create an arrays of String and use for each loop to iterate over them
	     * create an arrays of double and use for each loop to iterate over them
	     * 
	     */
	    
	    String [] words = {"Java", "is", "fun", "to", "learn"};
	    for (String word:words) {
	    	System.out.println(word);
	    }
	    
	    double [] doubs = {1, 3, 5, 6, 8, 9};
	    for (double doub : doubs ) {
	    	System.out.print(doub+" ");
	    }
	}

}
