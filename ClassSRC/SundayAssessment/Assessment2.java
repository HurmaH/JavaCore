package SundayAssessment;

import java.util.ArrayList;

public class Assessment2 {
	
	public static void main(String[] args) {
		
		//1. 
//		int a = 1;
//        ArrayList<Integer>  list= new ArrayList<>();
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        System.out.println( list.remove( a )  );
		
		//2.
		Integer a=1;
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(1);
		System.out.println( list1.remove( a ) );
		
		//6.
		list1.size();//.isEmpty(), .contains()
		
		//7.
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("James");
		names.add("Aaron");
		
		names.remove("James");
	//	names.remove(1);
		System.out.println(names);
		
		//8.
		char A = 'U';
		Numbers(A);
		
		//9.
		//int num1 = 20L (int) ;
		int num2 = (int) 20L;
		//int num3 = 20L ;
		System.out.println(num2);
		
		//10.
		String totalNumber = "200" ;
		int Total = new Integer ( totalNumber );
		System.out.println(Total);
		
		int Total2 = Integer.parseInt( totalNumber);
		System.out.println(Total2);
		
		int Total3 = Integer.valueOf( totalNumber);
		System.out.println(Total3);

	} //end of main method

		public static void Numbers( int num1) {
		 System.out.println("int number: "+num1);
		}

	   public static void Numbers( double num1) {
   		System.out.println("double number: "+num1);
    	}

	   public static void Numbers( short  num1) {
		System.out.println("short number: "+num1);
    	}
		
}
