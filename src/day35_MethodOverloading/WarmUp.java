package day35_MethodOverloading;

public class WarmUp{
/*
 * Warm up

Create a static method called findLongestWord
this method have one parameter as String vararg
and return the longest word as String	
 */
	
	public static void main(String[] args) {
		System.out.println(findLongestWord ("Release", "the", "horse", "Spartans"));
	
    }
	
	public static String findLongestWord (String... words) {
		String longest = words[0];
		for(String w:words) {
			if (w.length()>longest.length()) {
				longest=w;
			}
		}
		
		return longest;
	}
}
