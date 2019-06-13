package day34_ReturnVARargsCommand;

public class senteBuildrr {
	public static void main(String[] args) {
		
		System.out.println(sentenceBuilder ("Mishka", "Juyje", "Java"));
		System.out.println(wordBuilder ("Mishka", "Juyje", "Java")); 
		
		
	}
	// Task 4
	  // create a static method sentenceBuilder
	  // take string vararg words as parameter
	  // return the concatenation of all the arguments user passed
	  // call this method to see your result
	public static String sentenceBuilder (String... words) {
		String sentence ="";
		for (int i=0; i< words.length; i++) {
			sentence += words[i]+" ";
		}
		
		return sentence;
	}
	
	// Task 5
	  // create a static method wordBuilder
	  // take string vararg words as parameter
	  // return the concatenation of last character
	  // from all the words user passed
	  // call this method to see your result
	public static String wordBuilder (String... words) {
		String lastChars ="";
		for (int i=0; i< words.length; i++) {
			lastChars += words[i].charAt(words[i].length()-1);
		}
		
		return lastChars;
	}

}
