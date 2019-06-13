package day13;

public class StringClassPractice {
	public static void main(String[] args) {
		/*
		 * 
		 */
		
		String s1 = "abc";
		String s2 = "ABC";
		
		//.equals 
		
		boolean b1 = s1.equals("abc");
		boolean b2 = s1.equals(s2);
		
		//.equalsIgnoreCase
		boolean b3 = s1.equalsIgnoreCase(s2);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		//.toLowercase & .toUpperCase
		System.out.println(s1+"---> Uppercase--->"+s1.toUpperCase());
		System.out.println(s2+"---> Lowercase--->"+s2.toLowerCase());
		;
		
		//.charAt(0
		System.out.println(s1.charAt(2));
		
		//.length -- getting length of String
		
		int countOfChar = s1.length();
		System.out.println(countOfChar);
		
		//.contains("something)
		String name3 = "Hurmu";
		boolean uExist = name3.contains("u");
		System.out.println(uExist);
				
		//substring (beginning index, ending index);
		//"Hurmu; 
		String subString = name3.substring(1,4);
		System.out.println(subString);
		
		//indexOf(char) -- 
		int idxOf=name3.indexOf("u");
		System.out.println(idxOf);
		System.out.println(name3.indexOf("r"));
		
	}

}
