package day36_WrapperClass;

public class StringToPrimitiveAndWrapper {
	public static void main(String[] args) {
		
		/*
		 * From String to Primitive 
		 * X.parseX method will tahe String
		 * and return --> primitive value
		 */
		//Converting String to primitive ==> X.parseX(str)
		boolean b1 = Boolean.parseBoolean("true");//true
		boolean b2 = Boolean.parseBoolean("ABC"); //false
		boolean b3 = Boolean.parseBoolean("TRUE");//true
		
		//Converting String to wrapper class ==> X.valueOf(str)
		/*
		 * From String to Wrapper Class Object
		 * valuOf method will take String
		 * and return --> wrapper class object
		 * 
		 */
		
		String d = "3.14";
		Double d1= Double.valueOf(d);
		System.out.println(d1.toString());
		
		double d2 = d1; //---> auto-unboxing
		
		//int i = null; //type mismatch, cannot convert from null to int 
		Integer i1 = null;
		Double d6 = null;
		
		
	}

}
