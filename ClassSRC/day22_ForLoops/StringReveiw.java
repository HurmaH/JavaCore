package day22_ForLoops;

public class StringReveiw {
	public static void main(String[] args) {
		            //0123456789012345678901
		String str = "Java String is Awesome";
		int count = str.length();
		int lastIndex=count-1;
		
		System.out.println("Char count: "+count);
		System.out.println("Last char index: "+ lastIndex);
		
		//getting index of word String 
		int idxWrdStr = str.indexOf("String");
		System.out.println(idxWrdStr);
		
		//what if we have more than one
		int idxOfA=str.indexOf("A");
		System.out.println(idxOfA);//first occurance
		
		//how to get word "is";
		String is = str.substring(12,14);
		System.out.println(is);
		
		//finding index of second a
		int idxOfFirsta = str.indexOf("a");
		int idxOfSeconda= str.indexOf("a",idxOfFirsta+1);
		
		System.out.println(idxOfFirsta);
		System.out.println(idxOfSeconda);
		
		
	}

}
