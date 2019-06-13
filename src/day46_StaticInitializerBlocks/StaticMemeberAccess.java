package day46_StaticInitializerBlocks;

public class StaticMemeberAccess {
	static int num1;//static
	int num3;       //instance
	
	static int staticVar;//static
	int instanceVar;       //instance
	
	public static void main(String[] args) {
		System.out.println(num1++);//will post increment
		
		int num2=0;//will give error below statement if not initialized
		System.out.println(num2++);
		
		//System.out.println(num3); 
		//---> gives error because num3 instance
		//we can not access any instance member in static method
		//need to create object
		
		StaticMemeberAccess s1 = new StaticMemeberAccess();
		System.out.println("Value of instance field num3: "+s1.num3);
		
	}
	
	//what cane we access inside instance method
	//any instance field, static field
	//any instance Method, static method
	
	public void doInstanceThing() {
		System.out.println("Instance variable "+instanceVar );
		//System.out.println(num2); --> num2 cannot be resolved to value
		System.out.println("Static variable " + staticVar);
	}
	
	//static method can only access static members,
	//static field and static method
	public static void doStaticThing() {
		//System.out.println("Instance variable "+instanceVar );
		System.out.println("Static variable " + staticVar);
	}

}
