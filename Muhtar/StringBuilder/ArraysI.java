package StringBuilder;

import java.util.Arrays;

public class ArraysI {
public static void main(String[] KFC) {
		
		int s=10;
		 
		
		int arrnum[] = {10, 20, 30, 40};
		// index        0,  1,  2,   3
		//[ represents the index num of the vlaues.]
			int resultnum = arrnum[3];
			
			System.out.println(resultnum);
			
			System.out.println( arrnum[2] );  //30
		
		System.out.println( arrnum );
		
		/*
		  Arrays methods: toString, sort, copyOf(), copyOfRange()
		  
		  String methods(related to array): split, toCharArray. 
		  
		 
		 */
		
	// Arrays.toString( arrayName ): returns a STring by converting the given array.
			// only applies to single dimentional array	
		
		
		String[] strArr= {"A", "B", "C", "D"};
		// index num:      0    1    2    3
		
		System.out.println(strArr[0]);
		System.out.println(strArr);
		
		  String str1= Arrays.toString(strArr);     
			System.out.println("converted: "+str1);
		
			System.out.println(Arrays.toString(strArr).toLowerCase());
		
			System.out.println(strArr[0]+" "+strArr[strArr.length-1]);
			
			for(int i=0; i<strArr.length ; i++ ) {
				System.out.println(strArr[i]);
			}
			
			System.out.println(Arrays.toString(strArr));
			
			
		// Arrays.sort( ArrayName ):it sorts the value of the given array.
		
			int[] arr1= {10,9,8,7,6,5,4,3,2};
				Arrays.sort(arr1);
				
				System.out.println( Arrays.toString(arr1));
				
			/*
			  user enters 5 numbers, 
			  		return the largest and smallest number.
			 */
				
				String[] strArr2= {"Muhtar","Akbar","Bilginur","Zaim"};
				Arrays.sort(strArr2);
				System.out.println( Arrays.toString(strArr2) );
				
				
//			Scanner scan=new Scanner(System.in);
//			int[] inputNumbers= new int[5];
//			
//			for(int i=0; i< inputNumbers.length; i++ ) {
//				
//				System.out.println("Enter your number: ");
//				int input=scan.nextInt();
//				
//				inputNumbers[i] = input;   // store user entered number to the array
//			
//			}
//				
//			System.out.println(Arrays.toString(inputNumbers));
//			
//			Arrays.sort(inputNumbers); // largest num will be the last index of the array, 
//			// smallest num will be index 0
//		System.out.println("The largest number is: "+inputNumbers[inputNumbers.length-1]);
//	    System.out.println("Smallest num: "+inputNumbers[0]);
//	    
//	    
	    
	    // Arrays.CopyOf(ArrayName, ending index): ending index is excluded.
							// it wioll strat to copy from index 0 till ending index.
	    int[] ArrNum= {1,2,3,4,5,6,7};
	    
	    int[] arrNum2 =  Arrays.copyOf(ArrNum, 4+1) ;
	    
	    System.out.println(Arrays.toString(arrNum2));
	    
	    
	    
	    
	    // Arrays.copyOfRange(ArrayName, beginning index, ending index): pretty much substring
	    int[] originalArr= {10,20,30,40,50, 60};
	    
	 int[] copiedArr= Arrays.copyOfRange(originalArr, 1 , 3+1) ;
	 
	 System.out.println(Arrays.toString(copiedArr));
	    
	 String[] company1= {"Muhtar","Akbar","Muradil","Kuzzat"};
	 String[] company2=Arrays.copyOf(company1, company1.length);
	 
	 System.out.println( Arrays.toString(company2));
	 
	 
	 int[] arrs = {1000,200,30,40, 50, 60, 100, 90, 9000};
	 Arrays.sort(arrs);
	 System.out.println(Arrays.toString(arrs));
	 
	 arrs = Arrays.copyOf(arrs, 6);
	 
	 System.out.println(Arrays.toString(arrs));
	    
	    
	 int[] nums1=new int[2];
	 	nums1[0] = 10;
	 	nums1[1] = 20;
	 	
	 	nums1 = new int[4];
	 	nums1[0]=30;
	 	nums1[1]=40;
	 
	 System.out.println(Arrays.toString(nums1));
	 
	 
	 /*
	  main:  
	  	1. public static void main(String[] args){ }
	  	2. static public void main(String[] nums){ }
	  	3. public static void main(String...  KFC){ }
	  	4. public static void main(String args[]){ }
	  
	  
	  
	  
	  
	  
	  */
}

}
