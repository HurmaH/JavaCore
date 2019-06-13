package day35_MethodOverloading;

public class MethosOverloading4Casting{
	public static void main(String[] args) {
		
		//ANY literal non- fractional numbers will be seen as int
		//ANY literal fractional numbers will be seen as double
		
		add (10);   //it can take both int and long method, but will go first with
		add (10L);  //
	}
	
	public static void add (int x) {
		System.out.println("int x "+x);
	}
	
	
	public static void add (long x) {
		System.out.println("long x "+x);
	}

}
