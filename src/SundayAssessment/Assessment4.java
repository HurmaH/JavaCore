package SundayAssessment;

import java.util.ArrayList;
import java.util.List;

public class Assessment4 {
	public static void main(String[] args) {
		
		//1.
		 int score = 60;
//         switch (score) {
//             default:
//                 System.out.println("Not a valid score");
//             case score < 70:
//                 System.out.println("Failed");
//                 break;
//             case score >= 70:
//                 System.out.println("Passed");
//                 break;
         //}
		 
		 //3.
		  //add(10.0, null);
		  
		  
		//4.
		  Point p1 = new Point();
          Point p2 = new Point();
	         p1.x = 17;//19
	         p1.y = 35;//35
	         p2.x = 19;//19
	         p2.y = 40;//40

	         System.out.println(p1.x + ":" + p1.y);

	         System.out.println(p2.x + ":" + p2.y );
	         
	    //5.
	         
	         List<String> list = new ArrayList<>();
	         list.add(0, "Array");
	         list.add(0, "List");

	         System.out.println(list);
	         
	   //6. 
	         Boolean b1 = new Boolean("tRuE");
	         Boolean b2 = new Boolean("fAlSe");
	         Boolean b3 = new Boolean("abc");
	         Boolean b4 = null;

	         System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
	         
	   //7. 
//	         int [ ] arr = { 3,  2,  1 };
//	         for( int  i  :  arr ) {
//	             System.out.println( arr[ i ] );
//	         }
	         
	   //9.
	         new B( );
	         
	   //10.
	         Boolean [] arr = new Boolean[2];
	         System.out.println(arr[0] + ":" + arr[1]);
	         
	    
		 
		 
	}//end main method
	
	//3.
	  private static void add (double  d1,  double  d2 ) {
	         System.out.println("double version: " + (d1 + d2));
     }
	  
	  private static void add(Double d1, Double d2) {
	        System.out.println("Double version: " + (d1 + d2));
     }
	
	

}//clss end

//4.
class Point {
    static int x;
    int y;
}

//9.
class A {
    A( ) {
        this(1);
        System.out.println("M");
    }

    A(int i) {
        System.out.println("N");
    }
}

class B extends A {
}


