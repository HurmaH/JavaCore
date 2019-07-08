
public class Repl7_1 {
	
	public static String makeThreeSubstr(String word, 
			                             int startIndex, 
			                             int endIndex)
	{
		
		String newStr = word.substring(startIndex, endIndex)+ 
				        word.substring(startIndex, endIndex)+
				        word.substring(startIndex, endIndex);
	
	    return newStr;
				
						
//		return word.substring(startIndex, endIndex)+
//			   word.substring(startIndex, endIndex)+
//			   word.substring(startIndex, endIndex);
		
	}

}
