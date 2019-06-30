
public class HelloWorld2 {
	
	static int nums=9;
	int age=5;
	String name="Jamol";
	static String lastName="Kamolov";
	
		public HelloWorld2(){
		System.out.println("superclass no arg const");
		}
	
		public HelloWorld2(String name){
		System.out.println("superclass one arg const");
		this.name=name;
	     }
	
	static {
		System.out.println("superclass Static block running");
		lastName="Mavlonov";
		nums=10;
	}
	
	{
		System.out.println("superclass int block running");
		this.name="Chaman";
		nums=12;
	}
	
	public static void changeNums () {
		System.out.println("Static method");
	
	}
//	public void changeNums () {
//		System.out.println("Static method");
//	return null;
//	}
	
	public void changeAge () {
		System.out.println("instance method");
		age=15;
	}

}
