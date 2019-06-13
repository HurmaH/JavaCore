package Interview;

public class CountingAcharInLoop {
	public static void main(String[] args) {
		//get unique chracter out of String:
		
		String str = "AAccBBBdEEf";
		
		//store first char into newStr
		//store the next char into newStr if it's not already
		
		System.out.println(str);
		String newStr="";
		
		for (int i=0; i<str.length(); i++) {
			String eachChar=str.charAt(i)+"";
			if (newStr.contains(eachChar)) {
				 System.out.println(str.charAt(i)+" duplicate");
			}else {
				 newStr = newStr +str.charAt(i);
			}
		}
		
		System.out.println(newStr);
		
	}
 
}
