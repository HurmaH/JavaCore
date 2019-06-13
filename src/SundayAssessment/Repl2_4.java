package SundayAssessment;

public class Repl2_4 {
	
	public static void main(String[] args) {
	    System.out.println("Hello world!");
	  }
//	  Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.
//
//
//
//			  Examples:
//			  Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
//			  Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") - returns true, because laptop appears twice.
//	  
	  /**
		 * @param target - string that you need to check.
		 * @param sentence - string where you need to lookup for the target string.
		 * @return 
		 */
		public static boolean appearsTwice(String target, String sentence) {
			
			

			sentence = sentence.replace('.', ' ');
			sentence = sentence.replace(',', ' ');
			
	        String [] words = sentence.split(" ");
	  
	       int count = 0;
		 
		   for (int i = 0; i < words.length; i++){
		      if (target.equals(words[i])){
		       count++;
		      }
		   }
		   
		   return count==2;
		}
	}

