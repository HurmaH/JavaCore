package day62_Exception;

public class GeneralizedTryCatch {
	public static void main(String[] args) {
		
		//NullPointerException, //ArithmeticException //StringIndexOutOfBoundsException 
		// Exception is a super class of RuntimeException, and it is super class of 
		//StringIndexOutOfBoundsException, ArithmeticException 
		//so it can be generelized catch (RunTimeException r)
		
		System.out.println("Beginning");
		String str = "abc";
		int num1 = 10;
		int num2 = 0;
		//whenever there is exception comes, program goes outside of try block immidiatly
		//looks for related catch
		try {
			System.out.println("Begin");
		    System.out.println(str.charAt(100));//new StringIndexOutOfBoundsException created behind
		    System.out.println(num1/num2);      //new ArithmeticException() created
		    System.out.println("End");
		//}catch (Exception ex) { //Exception ex = new StringIndexOutOfBoundsException ();
			                      //Exception ex =new ArithmeticException()
			
		//Or
		}catch (RuntimeException r) {//Exception ex = new StringIndexOutOfBoundsException ();
                         //Exception ex =new ArithmeticException()
			System.out.println("The message : "+r.getMessage());//another constructor of exception class with argument will give message
		}
		
		System.out.println("End of Code");
		
	}

}
