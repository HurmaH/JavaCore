package day49_Inheritence;

public class SuperPhone extends SuperDevice {
	
  //int serialNum; -->> coming from parent class
	String brand;
	int screenSize;
	
	public SuperPhone() {
		super(100); // if this was not given compiler would run implicitly no arg compiler, but this time it runs super class constructor with one arg 
	//	super(); should be first line
		System.out.println("SuperPhone Constructor");
	}
	
	 public SuperPhone(String brand, int screenSize,int serialNum ) {
    // super();
	    super(serialNum); //to get this.serialNum = serialNum; 
	    //this.serialNum = serialNum;
	    this.brand = brand;
	    this.screenSize = screenSize;
	     
	  }
	
	
	public static void main(String[] args) {
		
		SuperPhone sp = new SuperPhone ();
		//Steps of flow:
		//1. it will go to the no arg constructor of class SuperPhone
		//2. will run first super(100) that goes to super class constructor with 1 arg
		//3. will run whatever inside constructor of super class
		//4. com back to SuperPhone class constructor and run rest line
		
		System.out.println("-------------p1 object------------");
		SuperPhone p1 = new SuperPhone("iphone", 7 , 123) ;
	    
	    System.out.println(p1.brand);
	    System.out.println(p1.screenSize);
	    System.out.println(p1.serialNum);
		
		
	}

}
