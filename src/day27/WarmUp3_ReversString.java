package day27;

import java.util.Arrays;

public class WarmUp3_ReversString {
	public static void main(String[] args) {		
		//reversing only one word by swapping
		String one = "Cybertek";
		char [] wordChars = one.toCharArray();
		int lastIndex = wordChars.length-1;
		
		for (int i=0; i<wordChars.length/2; i++) {
			char temp = wordChars[i];
			wordChars[i]=wordChars[lastIndex-i];
			wordChars[lastIndex-i]=temp;
		}
		System.out.println(Arrays.toString(wordChars));
		
				
		//2.reversing all words of sentence
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String [] words = str.split(" ");
		String reversedSentence = "";
		
		for (int i=0; i<words.length; i++) {
			char [] wordCharss = words[i].toCharArray();
			int lastIindex = wordCharss.length - 1;
			
			for (int j=0; j<wordCharss.length/2; j++) {
				/// create a temp char variable so we can temp store the value we want to swap
				char temp = wordChars[j];
				wordChars[j]= wordChars[lastIndex-i];
				wordChars[lastIndex-i]=wordChars[j];
			}
			// how to change char array to a String 
		      String reversed = new String(wordChars);
		      reversedSentence = reversedSentence + reversed + " " ; 
		      //System.out.println(reversed);
			
		}
		System.out.println(reversedSentence);
		
		
		
	}

}
