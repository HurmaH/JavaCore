package day16_MoreStringMethods;

public class LastIndexOf {
	public static void main(String[] args) {
		            //0123456789012
		String str = "Java is fun !";
		
		//give me last
		int index = str.lastIndexOf(" ");
		System.out.println(index);
		
		System.out.println("lastIndex of \"a\"="+ str.lastIndexOf('a') );
	}

}
