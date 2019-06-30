package day62_Exception;

public class Thread_sleep {
	public static void main(String[] args) throws InterruptedException {
		
		//Thread.sleep(1000);
		
		 System.out.println("Beginning");
		    // CALLING A METHOD THAT MIGHT THROW A CHECKED EXCEPTION 
		    
		    for (int i = 1; i <= 10; i++) {
		      
		   System.out.println("i is  " + i);
		     
		   Thread.sleep(2000);
		   
		   try {
		        Thread.sleep(1000); 
		      } catch (Exception e) {
		        System.out.println("caught");
		      }
		      
		    }
		
	}

}
