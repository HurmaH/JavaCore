package day33_ReturnMethod;

public class WarmUPOptional {
/*
 *  Optional :     
 * create a method that take one String parameter as sentence 
 * return first character for 
 * first word and all characters of last word except first char
 * example : Love Java --> Lava 
 * Hold the door --? Hoor
 * 
 */
	public static void main(String[] args) {
		String str = "Life is Beautiful";
		System.out.println(target(str));
	}
	
	//Optional:
	public static String target (String str) {
		String [] strArr = str.split(" ");
			
		return strArr[0].charAt(0)+strArr[strArr.length-1].substring(1);
	}
	
	

}
