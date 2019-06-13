package day16_MoreStringMethods;

public class ConcatMethod {
	public static void main(String[] args) {
		
		String st1 = "Java is fun!";
		String st2 = "Yes, it is !!";
		String st3 = "Oh yeah!!";
		
		System.out.println(st1.concat(st2).concat(st3));
		System.out.println(st1+st2+st3);
	}

}
