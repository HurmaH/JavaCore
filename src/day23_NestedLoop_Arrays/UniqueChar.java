package day23_NestedLoop_Arrays;

public class UniqueChar {
	public static void main(String[] args) {
		
		String str = "aaaabbcc"; // get -->abc
		String unique ="";
		
		for (int i=0; i<str.length(); i++) {
			                    //make string from char
			if (!(unique.contains(str.charAt(i)+""))) {
				unique += str.charAt(i);
			}
		}
		
		System.out.println(unique);
	}

}
