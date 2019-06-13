package Interview;

public class SubstringWithLoop {
	public static void main(String[] args) {
		//Task2
	                //012345678
	    String str = "ABCDEFGHIJKL";
	    
	    //print 2 letter at a time compared to one from previous 
	    
	    //ABCDEFGH --> AB CD EF GH
	    
	    for (int i=0; i<str.length(); i+=2) {
	    	
	    	if (i!=str.length()-1) {
	    		System.out.print(str.substring(i, i+2)+" ");
	    	}else {
	    		System.out.print(str.charAt(i));
	    	}
	    }
	    
	    //get 3 letters
	    System.out.println();
	    for (int i=0; i<str.length(); i+=3) {
	    	
	    	if (i!=str.length()-2) {
	    		System.out.print(str.substring(i, i+3)+" ");
	    	}else {
	    		System.out.print(str.charAt(i));
	    	}
	    }
	}
	

}
