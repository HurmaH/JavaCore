package day14;

public class StringReveiw {
	public static void main(String[] args) {
		
		//substing
		
		//TASK1
		String name = "Hur  ma";
		
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.substring(0,3));
		
		System.out.println(name.substring(name.length()/2));
		
		char c1 = name.charAt(0);
		char c2 = name.charAt(name.length()-1);
		System.out.println(c1+c2);
		
		
		System.out.println(name.substring(name.indexOf("r"),name.indexOf("m")));
		
		
		
		
	}

}
