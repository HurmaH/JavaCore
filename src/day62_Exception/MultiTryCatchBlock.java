package day62_Exception;

public class MultiTryCatchBlock {
	public static void main(String[] args) {
		
		//NullPointerException, //ArithmeticException //StringIndexOutOfBoundsException 
		
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
		}catch (ArithmeticException ae) {
			System.out.println("Second number cannot be zero");
		}catch (StringIndexOutOfBoundsException si) {
			System.out.println("Index is out of bond");
		}
		
		System.out.println("Endof Code");
		
	}

}
