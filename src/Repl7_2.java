
public class Repl7_2 {
	
	public static void main(String[] args) 
	{
		String[] arr = {"yolo", "hey","this is long"};
		
		System.out.println(minVowels(arr));
		//should print "hi"
	}
	
	public static String minVowels(String[] words)
	{
		//String[] words = {"yolo", "hey","hi","this is long", "i"};
		//count how many vowels in each word
		
		int minCount = countVowels (words[0]);//2
		String minWord = words[0];
		
		for(int i=1; i<words.length; i++) {//int i=1 because we will compare with index 0 as given above
			//(        1           <minCount)
			if(countVowels(words[i])<minCount) { //index 1= hey minCount =1
				minWord = words[i];              //minWord =hey
				
	                  // countVowels (hi)  ==1			
			}else if (countVowels(words[i])==minCount) {
				if (words[i].length()<minWord.length()) {
					minWord =words[i];
				}
			}
		}//end of for loop
		
		return minWord;
	}
	
	public static int countVowels(String s)
	{		
		//String s = "maral"; //MARAL
		//if(s.charAt(i)=='a' || s.charAt(i)=='e'  compare with other vowel)
		s= s.toLowerCase();
		int countVowel=0;
		for (int i=0; i<s.length(); i++) {
			if (isVowel(s.charAt(i))){//0-m, 1-a, 2-r, 3-a, 4-l
				countVowel++;              //count=1, 2
			}
		}
			
		return countVowel;
	}
	
	public static boolean isVowel(char ch)
	{
		return ch == 'a' ||
			   ch == 'e' ||
			   ch == 'i' ||
			   ch == 'o' ||
			   ch == 'u';
	}
	
	

}
