package Interview;

public class _166_UniqueString {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    
	    String strUniq="";
	    
	    for (int i=0; i<str.length(); i++) {
	      if (!strUniq.contains(str.charAt(i)+"")) {
	    	  strUniq += str.charAt(i);
	      }
	    }
	    
	    return strUniq;
	  }

}
