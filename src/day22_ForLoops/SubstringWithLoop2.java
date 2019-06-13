package day22_ForLoops;

public class SubstringWithLoop2 {
	public static void main(String[] args) {
		//1. print 2 letter at a time compared to one from previous tasks
		//2. Count the number of BC 
		String str = "ABCDEBC"; //--> AB BC CD DE EB BC
		String target = "BC";   //it can be any other target
		int targetLength=target.length();
		int count=0;
		for (int i=0; i<str.length()-targetLength+1; i++) {
			String word = str.substring(i, i+targetLength);
			System.out.print(word+" "); //1.print
			
			if (word.equals(target)) {
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of BC: "+count);
		
	}

}
