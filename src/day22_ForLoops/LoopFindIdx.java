package day22_ForLoops;

public class LoopFindIdx {
	public static void main(String[] args) {
		
		String str = "ABCAADKAB";
		
		//Task1:
		//loop throug ech char and 
		//print them out with - in between
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+"-");
		}
		
		//optional avoid dash at the end
		String eachChar = ""; 
		for (int i=0; i<str.length(); i++) {
			
			if (i==str.length()-1) {
			    eachChar += str.charAt(i);
			}else {
				eachChar += str.charAt(i)+"-";
		   }
		}
		System.out.println();
		System.out.println(eachChar);
	}
}
