package day35_MethodOverloading;

public class MethodOverloading2 {
	public static void main(String[] args) {
		
		String name = "Java";
		
		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf("a",2));
		
		System.out.println(name.replace('a', 'B'));
		System.out.println(name.replace("va", "java"));
	}

}
