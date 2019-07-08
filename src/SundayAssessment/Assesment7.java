package SundayAssessment;

public class Assesment7 {
	public static void main(String[] args)  {
		//1.
		//print( );
		
		//6.
		
		//print2();
		System.out.println("Test Completed");
		
		//7.
		int[ ] arr = { 1, 2, 3};

		try {

//		System.out.println( arr[100] );
//
//		} catch(RuntimeException  e) {

		System.out.println("Runtime Exception Found");

		} catch (ArrayIndexOutOfBoundsException e) {

		System.out.println("Array index out of bound Exception Found");

		} catch (IndexOutOfBoundsException e) {

		System.out.println("Index out of bound Exception Found");

		}
		
	}
	
	public static void print( ) throws Exception{

		int[ ]  arr = new int[5];

		for(int each: arr) {

		System.out.print(each+" : ");

		}

		}
	
	public static void print2() throws RuntimeException{

		throw new RuntimeException();

		}

}
