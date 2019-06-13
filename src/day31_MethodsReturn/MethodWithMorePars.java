package day31_MethodsReturn;

public class MethodWithMorePars {
	public static void main(String[] args) {
		login("mishka", "abc", true);
		
		login("juyje", "pass", false);
	}
	
	public static void login(String user, String password, boolean rememberMe) {
		System.out.println("You entered username :"+user);
		System.out.println("You entered password :"+password);
		if (rememberMe) {                                    //true by default
			System.out.println("You checked rememberMe checkbox");
		}else {
			System.out.println("You did not check rememberMe checkbox");
		}
	}
	

}
