package day33_ReturnMethod;

public class BreakVsReturn {
	/// BREAK VS RETURN 
	  /*
	   * break : ---> we can only use it inside switch and loop
	   * 
	   * return : --> exclusively used to return a value
	   *       or terminate method execution  
	   * */
	public static void main(String[] args) {
		
		ageTester(16);
		ageTester(34);
	}
	
	//you mayhave many return statement in different execution path
	// a method that return a value of any type 
	// should not have any chance to not return value 
	// or it will not even compile 
	  
   // you may have many return statement in different execution path 
	  // buy you may only return one value 
	public static boolean isAdultOrNot (int age) {
		
		boolean b;
		if (age<18) {
			System.out.println("not adult");
			b=false;
		}else {
			b=true;
		}
		return b;
		
	}
	
	public static void ageTester (int age) {
		if (age <18 ) {
			System.out.println("not adult");
			return; //once the return keyword is reached 
			        //it will exit the method
		}
		
		System.out.println("Go to work");
		System.out.println("Get paid");
		System.out.println("pay your bill");
	}

}
