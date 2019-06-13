package day16_MoreStringMethods;

import java.util.Scanner;

public class EndsWith {
	public static void main(String[] args) {
		
		//ask user to enter a name:
		//1. check whether the name starts with A
		//2. get the last index of letter a
		
		//3. with Optional
		// if the name has more than 2 character do these
		//	get the middle letter 
		 // if the name has odd length get single char
		// if the name has even length get both chars
		
		
		Scanner scan = new Scanner (System.in);
		
		String name = scan.nextLine();
		
		System.out.println("Name starts with \"A\"--->"+name.startsWith("A"));
		System.out.println("Last index of letter \"a\"--->"+name.lastIndexOf("x"));
		
		
		if (name.startsWith("A") && name.endsWith("x") ) {
			System.out.println("name match");
		}else {
			System.out.println("no match");
		}
		
		//Optional:
		if (name.length()>2) {
			if (name.length()%2 !=0) {
				System.out.println(name.charAt(name.length()/2));
			}else {
				System.out.println(name.substring(name.length()/2-1, name.length()/2+1));
			}
		}
		
		scan.close();
	
	
	}

}
