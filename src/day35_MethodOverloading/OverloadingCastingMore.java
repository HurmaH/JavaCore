package day35_MethodOverloading;

public class OverloadingCastingMore {
	//ANY literal non- fractional numbers will be seen as int
	//ANY literal fractional numbers will be seen as double
	public static void main(String[] args) {
		double d;
	    d = 10;
	    System.out.println(d);
	    
	    d = 10L; 
	    System.out.println(d);
	    
	    d = 10F; 
	    System.out.println(d);
	    
	    System.out.println("release method invoked:  ");
	    release((byte)10);
	    release((short)10);
	    release(10);
	    release(10L);
	    release(10F);
	    release(10d);  //double
	    release(10.5); //double
	    release(15/2); //will call int
	    release(15/2.0);//will call double
	    release (15/2.0F); //will call float
	}
	
	public static void release(int d) {
		System.out.println("int "+d);
	}
	
	public static void release(double d) {
		System.out.println("double "+d);
	}
	
	public static void release(float d) {
		System.out.println("float "+d);
	}
	
	
	
	
	

}
