package day16_MoreStringMethods;

public class Trimming {
	
	public static void main(String[] args) {
		
		String str = "  Gooo     JAVA SPARTANS     ";
		
		System.out.println(str);
        
        //System.out.println(str.trim() );
		System.out.println(str.trim());
        
        //TASK: get  JAVA SPARTAN from above String
		
		int lastO = str.lastIndexOf("o");
		String noGooo=str.substring(lastO+1);
		System.out.println("Before trimming--->" +noGooo);
		System.out.println("After trimming --->" +noGooo.trim());
		
		
	}

}
