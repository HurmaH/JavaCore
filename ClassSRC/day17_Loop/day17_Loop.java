package day17_Loop;

public class day17_Loop {
	
	public static void main(String[] args) {
		
		 String s1= "Hel";           // ---> in pool
		 String s2= s1.concat("lo"); //---> in heap
		 String s3 = "Hello";        // ---> in pool
		    System.out.println(s1==s3);
		
	}

}
