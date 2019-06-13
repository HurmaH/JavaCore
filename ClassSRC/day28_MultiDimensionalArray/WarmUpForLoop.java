package day28_MultiDimensionalArray;

public class WarmUpForLoop {
	public static void main(String[] args) {
		
		 String str = "Sunday Perfect Day to start coding" ;
		 String [] strArr= str.split(" ");
		 
		 // 1. coding start to Day Perfect Sunday
		 for (int i=strArr.length-1; i>=0; i--) {
			 System.out.print(strArr[i]+" ");
		 }
		 System.out.println();
		 
		// 2. Optional: reverse word + reverse each char of the word
		for (int i=strArr.length-1; i>=0; i--) {
			 String reverse = "";
			 for (int j=strArr[i].length()-1; j>=0; j--) {
				 reverse +=strArr[i].charAt(j)+"";
			 }
			 System.out.print(reverse+" ");
		 }
		 System.out.println();
		 
		 for (int i=str.length()-1; i>=0; i--) {
			 System.out.print(str.charAt(i)+"");
		 }
		 
		 
	}

}
