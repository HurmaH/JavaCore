package day63_Exception2;
//HOW DO WE GET RID OF COMPILER ERROR FOR CHECKED EXCEPTION 

// HANDLE OR DECLARE !!!! 

public class TestThrows {
	
	 public static void main(String[] args) throws Exception{
		    System.out.println("abc");
		    
		    throw new Exception();
		    
//		    try {
//		      throw new Exception() ;
//		    } catch (Exception e) {
//		      // TODO Auto-generated catch block
//		      System.out.println(":: ");
//		    } 
		    //throw new Throwable() ; 
		    
		    //throw new RuntimeException() ; 
		    //throw new FileNotFoundException(); 
		    //throw IOException(); 
		    
		  }

}
