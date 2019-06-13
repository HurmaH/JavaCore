package day16_MoreStringMethods;

public class ReplaceMethod {
	public static void main(String[] args) {
		
		String str = "Date is 03_25_2019";
		System.out.println(str);
		
	    str = str.replace('_', '-');
	    System.out.println(str);
	    
	    str = str.replace("is", "was");
	    System.out.println(str);
	    
	    String abc = "AAAAAABBBBBBBBCCCCC";
	    System.out.println(abc.replace("A", "Z"));
		
	    System.out.println(str.substring(str.indexOf("0")));
	}
}
