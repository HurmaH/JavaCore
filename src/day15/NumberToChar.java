package day15;

public class NumberToChar {
	public static void main(String[] args) {
		
		int x = 100;
		char myChar = (char)x;
		System.out.println(myChar);
		
		// the low to hight order in ascii table 
		// special character --> number ---> uppercase --> lowercase
				
				double y = 100.99 ; 
				char myChar2 = (char) y ; 
				System.out.println(myChar2);
				
		//comparision relation operator
				char c1 = 'a'; //97
				char c2 = 'B'; //66
				char c3 = ' ';
				
				
				System.out.println( (int) c1);
				System.out.println( (int) c2);
				System.out.println( (int) c3);
				
				System.out.println(c1 == c2);//false
				System.out.println(c1 != c2);//true
				System.out.println(c1 > c2);//true
				System.out.println(c1 < c2);//false
				
				
	}

}
