package day37_ArrayList;

public class UsingWrapperClassType {
	public static void main(String[] args) {
		
		String str="Spartan";
		
		Integer i=10;
		
		//as method return return Integer object it is storing in Integer refererance 
		Integer a1 = giveMeInteger (new Integer (300));   //when we call this method, integer object argument need to pass
		Integer a2 = giveMeInteger (Integer.valueOf(300));//autoboxing
		Integer a3 = giveMeInteger (300);                 //autoboxing
		
		int i1    = giveMeInteger (new Integer (300)); //unboxing
	
		
	}
	
	public static Integer giveMeInteger (Integer num) {
		//return new Integer(10);
		//return Integer.valuOf("10");
		
		return 10;
	}

}
