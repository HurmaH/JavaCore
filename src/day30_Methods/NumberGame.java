package day30_Methods;

public class NumberGame {
	
		 // Task 2 
	    /* 2.1
	     * create a static method with no return type
	     * called printTheDoubledNumber
	     * it takes 1 int as parameter
	     * and it will print out doubled number on the console
	     * 
	     * 2.2 
	     * create another static method with no return type
	     * called checkForAge 
	     * it takes 1 int age as parameter
	     * inside body , check whether the age is more than 18 
	     * if the age is more than 18 --> print adult 
	     * if not print not an adult  
	     * 
	     * */
		
		
    public static void main(String[] args) {
    	
    	printTheDoubledNumber(10);//20
    	checkForAge (21);         //Adult
    	
				
	}
	
	public static void printTheDoubledNumber (int num) {
			System.out.println(num*2);
	}
	
	public static void checkForAge(int age) {
		if (age>18) {
			System.out.println("Adult");
		}else {
			System.out.println("Not An Adult ");
		}
}

}
