package day16_MoreStringMethods;

public class StartsWith {
	public static void main(String[] args) {
		
		String name = "Sofiya";
		
		System.out.println(name.startsWith("H"));  //true
		System.out.println(name.startsWith("ma")); //false
		
		boolean b = name.startsWith("Hu");
		if (b) {
			System.out.println("Successful");
		}else {
			System.out.println("Not  Successful");
		}
	}

}
