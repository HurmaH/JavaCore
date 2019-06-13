package day9;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		
	//Task 3 : 
	//"Akbar".equals("akbar") ----> FALSE !!!!
	
	//Create a simple program to check login pre-define username and password 
	//as String and assign value 

	//Ask user to enter username and password using scanner

	//if username and password match login successful 
	//else login failed 

   //Optional Tasks : check for user name is admin or not 
   //           	if user is admin , whatever password should work 
	
		String username = "user";
		String password = "abc123";
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter username and password");
		String username2 = scan.nextLine();
		String password2 = scan.nextLine();
		
		if (username.equals(username2) && password.equals(password2)) {
			System.out.println("Login successful!");
		}else {
			System.out.println("Login failed!");
		}
		
		scan.close();
	}
}
