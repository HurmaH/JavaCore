package StringBuilder;

public class ClassG {
int a=10;
	
	public static void main(String[] args) {
	//	System.out.println(a);   // instance variable cannot be called in static method
		
		System.out.println(  new ClassG().a );
		
	}
	
	
	final int b;
	
//	ClassG(){
//		b=70;
//	}
	
	{
		b=30;
	}
	
	
	

}
