package SundayAssessment;

public class Assesment3 {
	public static void main(String[] args) {
		//1
		Assesment3 obj = new Assesment3();
        System.out.println(obj.name);
        
        //2
        int a = 2;
        boolean  res  =  false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);
        
        //3
        byte [ ]    val = new  byte[10];
        char [ ]  arr1 [ ] =  new  char[ 5 ][ ];
        int [ ]  arr2  = { 1,  2,  3,  4,  5 };
        //int [ ]  arr3 = new int[3] {10, 20, 30};
        
        //4
        //insert:
        //short [ ]  arr = new short [ 2 ] {100, 100};   Noo
        //short [ ]  arr;    arr = new short[ 2 ];       Yess
        //short [ ]  arr = { } ;                         Noo
        //short  arr [ ]  =  new short[2];               Yess
//        short [ ]  arr = new short[ ] {100, 100};//      Yess
//        arr[0] = 5;
//        arr[1] = 10;
        //System.out.println("[" + arr[0] + ", " + arr[1] + "]");
        
        //5.
        
        //6.
        String fruit = "mango";
        switch (fruit) {
            default:  System.out.println("ANY FRUIT WILL DO");
            case "Apple":   System.out.println("APPLE");
            case "Mango":  System.out.println("MANGO");
            case "Banana": System.out.println("BANANA");
                break;

        }    
        
        //7.
        //System.out.println("Output is: " + 10 != 5);
        
        //8.
        String [] arr = {"A", "B", "C", "D", "E"};
        for(int n = 0;  n < arr.length ;  n += 2) {
            System.out.print( arr[n] );

        }
        
        System.out.println();
        
        //9.
        //insert
        //char var = 7;
        //Integer var = 7;
        Character var = 7;
        switch(var) {
        case 7:
            System.out.println("Lucky no. 7");
            break;
        default:
           System.out.println("DEFAULT");

        }
        
        //10.
        
        
        
        
	}
	
	public  String  name ;
	public Assesment3() {
		// TODO Auto-generated constructor stub
		name = "James";
	}

}


