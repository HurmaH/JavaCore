package day32_ReturnMethod;

public class Adult {
	public static void main(String[] args) {
		
		boolean result = isAdultOrNot(17);

		System.out.println(isAdultOrNot(21));
		
	}
	
	public static boolean isAdultOrNot (int age) {
		
		return (age>18)?true:false;
		
		//if (age>18) {
		//	return true;
	    //  }else {
		//  return false;
		//  }
	
	}

}
