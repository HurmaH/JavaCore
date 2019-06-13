package day34_ReturnVARargsCommand;

public class VarArgs {
	
	public static void main(String[] args) {
		//Var Arg -->Variable number of arguments
		//We are passing two external data to a method
		//that ha
		
		/*
		 * Var Args -- is used to create a method
		 * that have 2 parameters
		 * 
		 * we are passing 2 arguments to a method
		 */
		           //argument
		add2Numbers(10,12);
		
		add3Numbers(26,22,20);
		
		addManyNumbers(new int[] {2,4,6,8,90});
		
		System.out.println("_______VAR - ARGS________");
		addManyNumbers2(1,22,3,4,5,6,8,9);
		addManyNumbers2(1,4,5,6,8,9);
		addManyNumbers2(8,9);
		
		addManyNumbers2(new int[] {2,4,6,8,90});
		
		// varArgs -- is used to create a method  
	    // that can take variable numbers of argument of same type
	    // when being called
	    
	    // varArg parameter is represented by using 
	    // ... after method parameter data type 
	    // and IT CAN ONLY BE USED HERE !!!
		
		
		
	}
	                               //method parameter
	public static void add2Numbers(int num1, int num2) {
		System.out.println(num1 +num2);
	}
	 
	
                                        //method parameter
     public static void add3Numbers(int num1, int num2, int num3) {
        System.out.println(num1 +num2 +num3);
    }
     
     public static void addManyNumbers(int [] manyNums) {
         int sum=0;
         for (int num:manyNums) {
        	 sum += num;
         }
         
         System.out.println(sum);
     }
     
     public static void addManyNumbers2(int ... manyNums) {
         int sum=0;
         for (int num:manyNums) {
        	 sum += num;
         }
         
         System.out.println(sum);
     }
	
	

}
