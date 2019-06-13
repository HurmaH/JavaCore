package day11;

public class NestedIf {
	
	public static void main(String[] args) {
		String username = "user";
		String password = "pass";
		
		if (username.equals("user") && password.equals("pass")) {
			System.out.println("login successful");
		} else {
			if (!username.equals("user")) {
				System.out.println("USERNAME not found");
			}else {
				System.out.println("Password is not found");
			}
		}
		
		//if without curly braces works with only one statement
		if (username.equals("user")) 
			if (password.equals("pass"))
				System.out.println("YEs Login Success");
				
	}

}
